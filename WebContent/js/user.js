// 修改头像
$(function() {
	// 获取img标签
	var picEle = $("#user .user-header .pic img");
	// 获取src属性对应的值
	var txt = $.trim(picEle.attr("src"));
	
	var options =
	{
		thumbBox: '.thumbBox',
		spinner: '.spinner',
		imgSrc: 'img/user2.jpg'
	};
	var cropper = $('.imageBox').cropbox(options);
	$('#upload-file').on('change', function(){
		var reader = new FileReader();
		reader.onload = function(e) {
			options.imgSrc = e.target.result;
			console.log(options.imgSrc);
			cropper = $('.imageBox').cropbox(options);
		}
		reader.readAsDataURL(this.files[0]);
		// this.files = [];
		// 点击提交之后 修改src属性
		$("#update-img .modal-footer button").eq(1).on('click', function(event) {
			event.preventDefault();
			
		});
	});
	$('#btnCrop').on('click', function(){
		var img = cropper.getDataURL();
		$('.cropped').html('');
		$('.cropped').append('<img src="'+img+'" align="absmiddle" style="width:50px;margin-top:4px;border-radius:50px;box-shadow:0px 0px 12px #7E7E7E;" ><p>50px*50px</p>');
		$('.cropped').append('<img src="'+img+'" align="absmiddle" style="width:70px;margin-top:4px;border-radius:70px;box-shadow:0px 0px 12px #7E7E7E;"><p>70px*70px</p>');
		$('.cropped').append('<img src="'+img+'" align="absmiddle" style="width:140px;margin-top:4px;border-radius:140px;box-shadow:0px 0px 12px #7E7E7E;"><p>140px*140px</p>');
	});
	$('#btnZoomIn').on('click', function(){
		cropper.zoomIn();
	});
	$('#btnZoomOut').on('click', function(){
		cropper.zoomOut();
	});

});

// 修改基本资料--生日
!function(){
	laydate.skin('molv');//切换皮肤，请查看skins下面皮肤库
	laydate({elem: '#birthday'});//绑定元素
	}();
	//日期范围限制
	var start = {
		elem: '#start',
		format: 'YYYY-MM-DD',
	    min: laydate.now(), //设定最小日期为当前日期
	    max: '2099-06-16', //最大日期
	    istime: true,
	    istoday: false,
	    choose: function(datas){
	         end.min = datas; //开始日选好后，重置结束日的最小日期
	         end.start = datas //将结束日的初始值设定为开始日
	     }
	 };
	 var end = {
	 	elem: '#end',
	 	format: 'YYYY-MM-DD',
	 	min: laydate.now(),
	 	max: '2099-06-16',
	 	istime: true,
	 	istoday: false,
	 	choose: function(datas){
	        start.max = datas; //结束日选好后，充值开始日的最大日期
	    }
	};
	laydate(start);
	laydate(end);
	//自定义日期格式
	laydate({
		elem: '#test1',
		format: 'YYYY年MM月DD日',
	    festival: true, //显示节日
	    choose: function(datas){ //选择日期完毕的回调
	    	alert('得到：'+datas);
	    }
	});
	//日期范围限定在昨天到明天
	laydate({
		elem: '#hello3',
	    min: laydate.now(-1), //-1代表昨天，-2代表前天，以此类推
	    max: laydate.now(+1) //+1代表明天，+2代表后天，以此类推
});

// 修改基本资料--简介 字数控制
$(function() {
	var $textarea = $("#introduction"),
	$num = $("#update-base .modal-body .num-tips i");
	$textarea.on('keyup',function(){
		var adviceTxt = $textarea.val();
    	$num.text(100-adviceTxt.length);
    	if(adviceTxt.length >= 100){
    		$num.text(0);
    		$textarea.val(adviceTxt.substring(0,100));
    	}
	});
});

// 修改基本资料--提交之后
$(function() {
	// 获取 保存按钮
	var saveBtn = $("#update-base .modal-footer .save");
	// 通过数组的方式 将表单元素的值 渲染到对应位置
	var valuesArr = [
		$("#realName"),
		$("#job"),
		$("#birthday"),
		$("#introduction")];
	var targetArr = [
		$("#user .base-info .realName"),
		$("#user .base-info .job"),
		$("#user .base-info .birthday"),
		$("#user .introduction")];
	saveBtn.on('click', function(event) {
		showValues(valuesArr,targetArr);
		// 性别 单选框 另外写
		var sexList = $("#sex input:radio[name='sex']");
		// console.log(sexList);
   		for (var i = 0; i < sexList.length; i++) {
    	   if(sexList.eq(i).prop('checked')){
    	    	var sexTxt = sexList.eq(i).val();
    	    	if(sexTxt != "") {
					$("#user .base-info .sex").html(sexTxt);
				}
    	   }
    	}

    	// 地区 多个下拉列表 另外写
		var addressList = $("#address select");
		console.log(addressList);
   		for (var i = 0; i < addressList.length; i++) {
    	    	var addressArr = [];
    	    	addressArr.push(addressList.eq(i).val());
				// console.log(addressArr);
    	    	if(addressArr != "") {
					$("#user .base-info .address").html(addressList.eq(0).val()+'-'+addressList.eq(1).val()+'-'+addressList.eq(2).val());
				}
    	   }
	});

	// 将用户填写的信息反映到对应位置
	function showValues(vArr,tArr) {
		$(vArr).each(function(index, el) {
			// console.log(el);
			var txt = el.val();
			// console.log(txt);
			if(txt != "") {
				tArr[index].html(txt);
			}
		});
	}
});

// var valuesName = $("#realName").val();
// 		if(valuesName != "") {
// 			$("#user .base-info .realName").html(valuesName);
// 		}
$(function(){
	
	$("#userName").blur(function(){
		//获取输入框内容并去空格
		var checkName = $("#userName").val().trim();
//		checkName.trim();
		//判断是否为空或小于两字符
//		console.log(checkName);
		if( checkName=="" || checkName.length < 2 ){
	        var errorMsg = '请输入至少2位的用户名.';
	        $("#usernameInfo").html(errorMsg);
	        //$parent.append('<span class="formtips pull-right onSuccess">'+errorMsg+'</span>');
	      }else{
	    	  $("#usernameInfo").html("");
	      }
	});
	
//	$("#userName").blur(function(){
//		var usernameInput = $(this).val();
//		$.post(
//			"checkUsername",
//			{"username":usernameInput},
//			function(data){
//				var isntExist = data.isntExist;
//				//alert(isntExist);
//				if(isntExist){
//					//alert("用户名可用");
//					$("#usernameInfo").html("用户名可用");
//				}else{
//					$("#usernameInfo").html("用户名已存在，请重新输入");
//				}
//			},
//			"json"
//		);
//	});
	
})
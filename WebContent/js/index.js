// 首页 导航栏部分 样式变化
// 排他思想
$(function() {
	paiTa($("#myNav ul li"),'active');
});

// 首页 推荐部分 关闭部分
$(function() {
	var closeIt = $("#recommend .list-group-item .list-user li.dislike");
	closeIt.on("click",function(e) {
		e.preventDefault();
		// 阻止冒泡
		e.stopPropagation();
		// console.log($(this));
		$(this).parents("li.list-group-item").eq(0).remove();
	});
});
// 首页 回到顶部部分
$(function() {
	// 侧边栏 效果
	var $scroTop = 0,
		$sideBar = $("#sideBar");
	$(window).scroll(function(event) {
		$scroTop = $(document).scrollTop();
		$scroTop > 0 ? $sideBar.fadeIn(400) : $sideBar.fadeOut(400);
	});

	var goBack = $("#sideBar li.goBack");
	goBack.mouseenter(function(event) {
		$(this).html("回到顶部")
	}).mouseleave(function(event) {
		$(this).html("<i class='glyphicon glyphicon-menu-up'></i>")
	}).on("click",function(e) {
		$("html,body").animate({scrollTop:0}, 500);
	});
});

// 排他思想封装
function paiTa(selector,className) {
	selector.on("click",function(event) {
		selector.removeClass(className);
		$(this).addClass(className);
	});
}
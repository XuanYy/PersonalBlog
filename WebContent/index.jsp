<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
	<meta>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
	<title>个人博客</title>
	<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="lib/font-awesome-4.7.0/css/font-awesome.min.css">
    <script type="text/javascript" src="lib/jquery.min.js"></script>
	<script type="text/javascript" src="lib/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	<!-- 浏览器兼容html5新增标签 -->
	<!-- 浏览器兼容css3媒体查询 -->
		<!--[if lt IE 9]>
    	<script src="WEB-INF/lib/html5shiv/html5shiv.min.js"></script>
    	<script src="WEB-INF/lib/respond/respond.min.js"></script>
    	<![endif]-->
</head>
<body>
    	<!-- 动态包含头部栏 -->
		<jsp:include page="header.jsp"/>
       
        <!--导航栏-->
        <nav id="myNav" class="navbar navbar-default">
            <div class="container">
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index.jsp">首页<span class="sr-only">(current)</span></a></li>
                        <li><a href="#">人工智能</a></li>
                        <li><a href="#">java开发</a></li>
                        <li><a href="#">云计算/大数据</a></li>
                        <li><a href="#">数据库</a></li>
                        <li><a href="#">移动开发</a></li>
                        <li><a href="#">数据库</a></li>
                        <li><a href="#">前端开发</a></li>
                        <li><a href="#">计算机基础</a></li>
                        <li><a href="#">架构</a></li>
                        <li><a href="#">编程</a></li>
                        <li><a href="#">物联网</a></li>
                        <li><a href="#">安全</a></li>
                    </ul>
                    <!--下拉列表-->
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">计算机基础</a></li>
                                <li><a href="#">移动开发</a></li>
                                <li><a href="#">安全</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">架构</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

    <!--轮播图部分-->
    <section id="section1" class="container">
        <div class="row">
            <div class="col-xs-4 left-img">
            <div>
                <a href="#">
                    <img src="img/carousel-left1.png" />
                    <div class="cover">用Python搭建“冲顶大会”外挂，王思聪们还舍得撒币吗？</div>
                </a>
            </div>
            <div>
                <a href="#">
                    <img src="img/carousel-left2.jpg" />
                    <div class="cover">一文帮你理解什么是深层置信网络（DBN）</div>
                </a>
            </div>
        </div>
        <div id="carousel1" class="carousel slide col-xs-8" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#carousel1" data-slide-to="0" class="active"></li>
                <li data-target="#carousel1" data-slide-to="1"></li>
                <li data-target="#carousel1" data-slide-to="2"></li>
            </ol>
            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="img/big1.jpg" alt="####">
                    <div class="carousel-caption">
                      ###
                    </div>
                </div>
                <div class="item">
                    <img src="img/big2.jpg" alt="####">
                    <div class="carousel-caption">
                     ###
                    </div>
                </div>
                <div class="item">
                   <img src="img/big1.jpg" alt="###">
                   <div class="carousel-caption">
                    ###
                    </div>
                </div>
            </div>
            <!-- Controls -->
            <a class="left carousel-control" href="#carousel1" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#carousel1" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </div>
</section>

<!--主体部分-->
<section id="content">
   <div class="container">
      <div class="row">
         <!-- 推荐文章部分 -->
         <div class="col-xs-9" id="recommend">
            <div>
               <span style="font-size: 25px;">
                  推荐
              </span>
          </div>
          <ul class="list-group">
           <li class="list-group-item">
              <a href="details.html">
                 <h2 style="font-size: 20px;">
                    微信小游戏「跳一跳」技术手段高分秘籍实现
                </h2>
                <div class="list-user clearfix">
                    <ul>
                       <li class="user-img"><img src="img/user1.jpg"></li>
                       <li class="user-name">程序员大咖</li>
                       <li class="time">2018-1-10</li>
                       <li class="type">微信开发</li>
                       <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
                       <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
                       <li class="dislike pull-right">X</li>
                   </ul>
                </div>
               </a>
             </li>
             <li class="list-group-item">
              <a href="details.html">
               <h2 style="font-size: 20px;">
                从“巨轮”到“快艇”，安波福要在智能汽车新大陆再建王朝丨Xtecher 评论
              </h2>
              <div class="list-user clearfix">
                <ul>
                 <li class="user-img"><img src="img/user2.jpg"></li>
                 <li class="user-name">程序员大咖</li>
                 <li class="time">2018-1-10</li>
                 <li class="type">微信开发</li>
                 <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
                 <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
                 <li class="dislike pull-right">X</li>
               </ul>
             </div>
           </a>
         </li>
         <li class="list-group-item">
          <a href="details.html">
           <h2 style="font-size: 20px;">
            微信小游戏「跳一跳」技术手段高分秘籍实现
          </h2>
          <div class="list-user clearfix">
            <ul>
             <li class="user-img"><img src="img/user1.jpg"></li>
             <li class="user-name">程序员大咖</li>
             <li class="time">2018-1-10</li>
             <li class="type">微信开发</li>
             <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
             <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
             <li class="dislike pull-right">X</li>
           </ul>
         </div>
       </a>
     </li>
     <li class="list-group-item">
      <a href="details.html">
       <h2 style="font-size: 20px;">
        从“巨轮”到“快艇”，安波福要在智能汽车新大陆再建王朝丨Xtecher 评论
      </h2>
      <div class="list-user clearfix">
        <ul>
         <li class="user-img"><img src="img/user2.jpg"></li>
         <li class="user-name">程序员大咖</li>
         <li class="time">2018-1-10</li>
         <li class="type">微信开发</li>
         <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
         <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
         <li class="dislike pull-right">X</li>
       </ul>
     </div>
   </a>
 </li>
 <li class="list-group-item">
  <a href="details.html">
   <h2 style="font-size: 20px;">
    微信小游戏「跳一跳」技术手段高分秘籍实现
  </h2>
  <div class="list-user clearfix">
    <ul>
     <li class="user-img"><img src="img/user1.jpg"></li>
     <li class="user-name">程序员大咖</li>
     <li class="time">2018-1-10</li>
     <li class="type">微信开发</li>
     <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
     <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
     <li class="dislike pull-right">X</li>
   </ul>
 </div>
</a>
</li>
<li class="list-group-item">
  <a href="details.html">
   <h2 style="font-size: 20px;">
    从“巨轮”到“快艇”，安波福要在智能汽车新大陆再建王朝丨Xtecher 评论
  </h2>
  <div class="list-user clearfix">
    <ul>
     <li class="user-img"><img src="img/user2.jpg"></li>
     <li class="user-name">程序员大咖</li>
     <li class="time">2018-1-10</li>
     <li class="type">微信开发</li>
     <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
     <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
     <li class="dislike pull-right">X</li>
   </ul>
 </div>
</a>
</li>
<li class="list-group-item">
  <a href="details.html">
   <h2 style="font-size: 20px;">
    微信小游戏「跳一跳」技术手段高分秘籍实现
  </h2>
  <div class="list-user clearfix">
    <ul>
     <li class="user-img"><img src="img/user1.jpg"></li>
     <li class="user-name">程序员大咖</li>
     <li class="time">2018-1-10</li>
     <li class="type">微信开发</li>
     <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
     <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
     <li class="dislike pull-right">X</li>
   </ul>
 </div>
</a>
</li>
<li class="list-group-item">
  <a href="details.html">
   <h2 style="font-size: 20px;">
    从“巨轮”到“快艇”，安波福要在智能汽车新大陆再建王朝丨Xtecher 评论
  </h2>
  <div class="list-user clearfix">
    <ul>
     <li class="user-img"><img src="img/user2.jpg"></li>
     <li class="user-name">程序员大咖</li>
     <li class="time">2018-1-10</li>
     <li class="type">微信开发</li>
     <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
     <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
     <li class="dislike pull-right">X</li>
   </ul>
 </div>
</a>
</li>
<li class="list-group-item">
  <a href="details.html">
   <h2 style="font-size: 20px;">
    微信小游戏「跳一跳」技术手段高分秘籍实现
  </h2>
  <div class="list-user clearfix">
    <ul>
     <li class="user-img"><img src="img/user1.jpg"></li>
     <li class="user-name">程序员大咖</li>
     <li class="time">2018-1-10</li>
     <li class="type">微信开发</li>
     <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
     <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
     <li class="dislike pull-right">X</li>
   </ul>
 </div>
</a>
</li>
<li class="list-group-item">
  <a href="details.html">
   <h2 style="font-size: 20px;">
    从“巨轮”到“快艇”，安波福要在智能汽车新大陆再建王朝丨Xtecher 评论
  </h2>
  <div class="list-user clearfix">
    <ul>
     <li class="user-img"><img src="img/user2.jpg"></li>
     <li class="user-name">程序员大咖</li>
     <li class="time">2018-1-10</li>
     <li class="type">微信开发</li>
     <li class="read-num"><i class="glyphicon glyphicon-eye-open"></i>888</li>
     <li class="review-num"><i class="glyphicon glyphicon-comment"></i>56</li>
     <li class="dislike pull-right">X</li>
   </ul>
   </div>
</a>
</li>
</ul>
<!-- 分页 -->
<nav aria-label="Page navigation" style="margin: 20px 200px;">
  <ul class="pagination">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
</div>
<!-- 右侧小模块 -->
<div class="col-xs-3">
   <!-- 最新最热 -->
   <div class="right-box">
      <!-- Nav tabs -->
      <ul class="nav nav-tabs" role="tablist">
         <li role="presentation" class="active"><a href="#new" aria-controls="new" role="tab" data-toggle="tab">最新</a></li>
         <li role="presentation"><a href="#hot" aria-controls="hot" role="tab" data-toggle="tab">最热</a></li>
     </ul>
     <!-- Tab panes -->
     <div class="tab-content">
         <div role="tabpanel" class="tab-pane active" id="new">
            <ul class="new_list">
               <li>
                  <a href="details.html" target="_blank">
                     史上最简单的 SpringCloud 教程 | 终章
                 </a>
             </li>
             <li>
              <a href="details.html" target="_blank">
                 最全Pycharm教程（1）——定制外观
             </a>
         </li>
         <li>
          <a href="details.html" target="_blank">
             [总结]视音频编解码技术零基础学习方法
         </a>
     </li>
     <li>
      <a href="details.html" target="_blank">
         Linux安装gcc 4.9.4编译器详解(CentOS 7 64位系统)
     </a>
 </li>
 <li>
  <a href="details.html" target="_blank">
     陀螺仪加速度计MPU6050
 </a>
</li>
</ul>
</div>
<div role="tabpanel" class="tab-pane" id="hot">
    <ul class="hot_list">
       <li>
          <a href="details.html" target="_blank">
             一些写给你的话
         </a>
     </li>
     <li>
      <a href="details.html" target="_blank">
         c++生成DLL文件之def动态导出方式
     </a>
 </li>
 <li>
  <a href="details.html" target="_blank">
     lalalalalla啦啦啦啦啦啦
 </a>
</li>
<li>
  <a href="details.html" target="_blank">
     Linux安装gcc 4.9.4编译器详解(CentOS 7 64位系统)
 </a>
</li>
<li>
  <a href="details.html" target="_blank">
     使用fullpage.js实现全屏滚动经验以及踩的坑 
 </a>
</li>
</ul>
</div>
</div>
</div>
<!-- 小轮播图 -->
<div class="right-box">
  <div id="small-carousel" class="carousel slide" data-ride="carousel">
     <!-- Indicators -->
     <ol class="carousel-indicators">
        <li data-target="#small-carousel" data-slide-to="0" class="active"></li>
        <li data-target="#small-carousel" data-slide-to="1"></li>
        <li data-target="#small-carousel" data-slide-to="2"></li>
        <li data-target="#small-carousel" data-slide-to="3"></li>
    </ol>
    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
           <img src="img/small1.png" alt="">
           <div class="carousel-caption">
              炫耀你自己的互联网世界
          </div>
      </div>
      <div class="item">
       <img src="img/small2.png" alt="">
       <div class="carousel-caption">
          分享生活中的点点滴滴
      </div>
  </div>
  <div class="item">
   <img src="img/small3.png" alt="">
   <div class="carousel-caption">
      吐槽作为一个程序猿的苦闷
  </div>
</div>
<div class="item">
   <img src="img/small4.png" alt="">
   <div class="carousel-caption">
      一花一世界一叶一菩提
  </div>
</div>
</div>
</div>
</div>
<!-- 联系我们 -->
<div class="right-box">
  <h3>联系我们</h3>
  <ul>
     <li><i class="glyphicon glyphicon-user"></i>轩洋</li>
     <li><i class="glyphicon glyphicon-earphone"></i>157-3695-0585</li>
     <li><i class="glyphicon glyphicon-envelope"></i>1337363534@qq.com</li>
     <li>学校：新乡学院</li>
     <li>院系：计算机与信息工程学院</li>
     <li>专业：计算机科学与技术</li>
 </ul>
</div>
</div>
</div>
</div>
</section>
<!-- SideBar -->
<section id="sideBar">
  <ul>
     <!-- 回到顶部 -->
     <li class="goBack">
        <i class="glyphicon glyphicon-menu-up"></i>
    </li>
</ul>
</section>
<!-- / SideBar -->
</body>
</html>
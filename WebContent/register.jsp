<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta>
	<title>注册</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/lib/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/lib/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/register.js"?v=20180204></script>
</head>
<body>
	<!-- 动态包含头部栏 -->
	<jsp:include page="header.jsp"/>
	
	<!-- 作为背景 -->
	<img class="register-bg" src="img/register-bg.jpg" alt="">
	<div id="img-txt">
		<a href="index.html"><img src="" alt="logo"></a>
		<p>时间是由分秒积成的，善于利用零星时间的人，才会做出更大的成绩来。</p>
		<p>——华罗庚</p>
	</div>
	<!-- 登录 -->
	<div id="register-box" class="col-xs-5 pull-right">
		<h3>欢迎注册</h3>
		<div class="user-info">
			<form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/register" method="post">
				<div class="form-group">
					<label for="userName" class="col-sm-3 control-label">用户名:</label>
					<div class="col-sm-9">
						<input type="text" class="required form-control" id="userName" name="username"
						placeholder="请输入您的用户名">
						<span id="usernameInfo"></span>
					</div>
				</div>
				<div class="form-group">
					<label for="password" class="col-sm-3 control-label">密码:</label>
					<div class="col-sm-9">
						<input type="password" class="required form-control" id="password" name="password"
						placeholder="请输入您的密码 不少于6位">
					</div>
				</div>
				<div class="form-group">
					<label for="confirmPassword" class="col-sm-3 control-label">确认密码:</label>
					<div class="col-sm-9">
						<input type="password" class="required form-control" id="confirmPassword"
						placeholder="请再输一次密码">
					</div>
				</div>
				<div class="form-group">
					<label for="confirmPassword" class="col-sm-3 control-label">验证码:</label>
					<div class="col-sm-5">
						<input type="text" class="required form-control" id="validate" name="verificationcode"
						placeholder="请输入验证码">
					</div>
					<div class="col-sm-4">
						<img src="createVerificationCode" alt="验证码图片">
					</div>
				</div>
				<!-- 错误信息显示 -->
				<div>${requestScope.loginInfo }</div>
				<div class="form-group">
					<div class="col-sm-12">
						<div class="col-sm-6"><button type="submit" class="registerBtn btn btn-primary">注册</button></div>
						<div class="col-sm-6"><button type="submit" class="resetBtn btn btn-primary">重置</button></div>
					</div>
				</div>
			</form>
		</div>
		<p>已有账号？<a href="login.jsp">立即登录</a></p>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录</title>
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="css/index.css">
<script type="text/javascript" src="lib/jquery.min.js"></script>
<script type="text/javascript" src="lib/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</head>
<body>

	<!-- 动态包含头部栏 -->
	<jsp:include page="header.jsp"/>

	<!-- 作为背景 -->
	<img class="login-bg" src="img/login-bg.jpg" alt="">
	<!-- 登录 -->
	<div class="login-box-wrap">
		<div id="login-box" class="col-xs-4">
			<h3>帐号登录</h3>
			<div class="user-info">
				<form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/login" method="post">
					<div class="form-group">
						<div class="col-sm-12">
							<input type="text" class="form-control" id="userName" name="username"
							placeholder="请输入您的用户名">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-12">
							<input type="password" class="form-control" id="password" name="password"
							placeholder="请输入您的帐号密码">
						</div>
					</div>
					<div class="form-group">
					<div class="col-sm-8">
						<input type="text" class="required form-control" id="validate" name="verificationcode"
						placeholder="请输入验证码">
					</div>
					<div class="col-sm-4">
						<img src="${pageContext.request.contextPath }/createVerificationCode" alt="验证码图片">
					</div>
				</div>
				<!-- 错误信息显示 -->
				<div>${requestScope.loginInfo }</div>
					<div class="form-group">
						<div class="col-sm-12">
							<button class="loginBtn col-sm-12" type="submit" class="btn btn-primary">登录</button>
						</div>
					</div>
				</form>
			</div>
			<p>还没有账号？<a href="register.jsp">立即注册</a></p>
		</div>
	</div>
</body>
</html>
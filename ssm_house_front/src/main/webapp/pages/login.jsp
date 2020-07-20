<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
	<link rel="stylesheet" href="../css/bootstrap.css" />
	<link rel="stylesheet" href="../css/login.css" />
	<link rel="stylesheet" href="../css/footer&cbl.css" />
	<link rel="stylesheet" href="../css/daohang.css" />
	<script type="text/javascript" src="../js/jquery-1.11.3.js" ></script>
	<script type="text/javascript" src="../js/bootstrap.js" ></script>
	<script type="text/javascript" src="../js/templet.js" ></script>
	<script type="text/javascript" src="../js/hp.js" ></script>
	<title>登录界面</title>
</head>
<style>
	.main{
		margin-top: 100px;
	}
	.errorMsg{
		color: red;
	}
</style>
<body>
<div id="main">
	<div class="main">
		<div class="container">
			<div class="c2">
				<a href=""></a><span>
						<img src="../img/logo.png" />
					</span></a>
				<p>登录界面</p>
			</div>
			<div class="c3">
				<form method="post" action="${pageContext.request.contextPath}/member/denglu">
					<div class="form-group">
						<label for="username">用户名</label>
						<input type="text" class="form-control" id="username" name="userName">
					</div>
					<div class="form-group">
						<label for="password">密码</label>
						<input type="password" class="form-control" id="password" name="passWord">
					</div>
					<div class="errorMsg">
						<%--用户名或者密码输入有误！--%>
						${resultInfo.errorMsg}
					</div>
					<div class="c3-1">
						<button id="denglu" type="submit" class="btn btn-default btn1">登录</button>
						<a href="${pageContext.request.contextPath}/pages/register.jsp" type="button" class="btn btn-default btn2">注册</a>
					</div>
					<div class="c3-3 clearfix">
						<a href="" class="pull-right">忘记密码？点这里找回</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

</body>
</html>

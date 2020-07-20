<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="stylesheet" href="../css/bootstrap.css" />
		<link rel="stylesheet" href="../css/register.css" />
		<link rel="stylesheet" href="../css/footer&cbl.css" />
		<link rel="stylesheet" href="../css/daohang.css" />
		<script type="text/javascript" src="../js/jquery-1.11.3.js" ></script>
		<script type="text/javascript" src="../js/bootstrap.js" ></script>
		<script type="text/javascript" src="../js/templet.js" ></script>
		<title>注册界面</title>
	</head>
	<style>
		.main{
			margin-top: 100px;
		}
	</style>
	<body>
	<div id="main">
		<div class="main">
			<div class="container  ">
				<div class="c2">
					<a href=""></a><span>
						<img src="../img/logo.png" />
					</span></a>
					<p>注册界面</p>
				</div>
				<div class="c3">
					<form method="post" action="${pageContext.request.contextPath}/member/register">
						<div class="form-group">
							<label for="username">用户名</label>
							<input type="text" class="form-control" id="username" name="userName">
							<span class="pp hide">此项必须填写</span>
						</div>
  						<div class="form-group">
    						<label for="password">密码 </label>
    						<input type="password" class="form-control" id="password" name="passWord">
  							<span class="pp hide">此项必须填写</span>
  						</div>
  						<div class="form-group">
    						<label for="repassword">再次输入密码 </label>
    						<input type="password" class="form-control" id="repassword">
  						</div>
						<div class="form-group">
							<label for="email">手机号 </label>
							<input type="text" class="form-control" id="email" name="telephone">
							<span class="pp hide">此项必须填写</span>
						</div>
						<div class="form-group">
							<label for="realName">姓名 </label>
							<input type="text" class="form-control" id="realName" name="realName">
							<span class="pp hide">此项必须填写</span>
						</div>
						<div class="form-group">
							<label for="identificationNum">身份证号 </label>
							<input type="text" class="form-control" id="identificationNum" name="identificationNum">
							<span class="pp hide">此项必须填写</span>
						</div>
  						<div class="c3-1">
							<button type="submit" class="btn btn-default btn1">注册</button>  
							<a href="${pageContext.request.contextPath}/pages/login.jsp" type="button" class="btn btn-default btn2">已经有账号了?请登录</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</body>
	<script type="text/javascript" src="../js/hp.js" ></script>
	<script type="text/javascript">
		/*$(function(){
			$("#dhbtn1").click(function(){
			//	console.log(1);
				$(".dhkuang").show();
				$(".dhneirong").animate("left","679px")
			})
		})*/
	</script>
	
</html>

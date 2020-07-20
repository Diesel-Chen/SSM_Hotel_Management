<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>酒店订单管理系统</title>
	<link rel="stylesheet" type="text/css" href="../css/style1.css">
	<link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
	<link rel="stylesheet" href="../plugins/datepicker/datepicker3.css">
	<link rel="stylesheet" href="../plugins/daterangepicker/daterangepicker.css">
	<style>
		.nav ul li:nth-of-type(3){
			background: rgb(255,255,86);
		}
		.bfenlei:nth-of-type(1){
			background: rgb(131,142,222);
		}
		#qtable{
			margin-top: 50px;
			margin-left: 180px;
		}
		#qtable td{
			height: 70px;
		}
		.kbox{
			/*border: 1px solid #000;*/
			height: 440px;
			width: 90%;
			margin: 0 auto;
		}
		.kbox table{
			text-align: center;
			margin: 20px auto;
		}
		.kbox table td{
			height: 50px;
			width: 200px;
		}

	</style>
</head>
<body>
	<div class="bbox">

		<jsp:include page="aside.jsp"></jsp:include>

		<div class="bright">

			<jsp:include page="header.jsp"></jsp:include>

			<h2><center>修改密码</center></h2>
			<div class="kbox">
				<form action="${pageContext.request.contextPath}/member/updatePassword" method="post">
					<input type="hidden" name="mid" value="${member.mid}" >
					<table border="1">
						<tr>
							<td>原密码</td>
							<td><input type="text" readonly="readonly" value="${member.passWord}" ></td>
						</tr>
						<tr>
							<td>新密码</td>
							<td><input type="text"  name="passWord" ></td>
						</tr>
						<tr>
							<td>确认密码</td>
							<td><input type="text"   ></td>
						</tr>
					</table>
					<center><button type="submit" class="btn btn-info ">确认修改</button></center>
				</form>
			</div>
		</div>
	</div>
	<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
	<script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
	<script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
	<script>

        $(function() {

            //Date picker
            $('#datepicker').datepicker({
                autoclose: true,
                format: 'mm/dd/yyyy'
            });
            $('#datepicker1').datepicker({
                autoclose: true,
                format: 'mm/dd/yyyy'
            });

        });

	</script>
</body>
</html>
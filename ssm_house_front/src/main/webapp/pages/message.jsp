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

	</style>
</head>
<body>
	<div class="bbox">

		<jsp:include page="aside.jsp"></jsp:include>

		<div class="bright">

			<jsp:include page="header.jsp"></jsp:include>

			<h2><center>查询房间</center></h2>

		</div>
	</div>
	<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
	<script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
	<script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
	<script>

		$()
        $(function() {
            alert("恭喜你,支付成功!")
			location.href="${pageContext.request.contextPath}/pages/main.jsp";

            //Date picker
            $('#datepicker').datepicker({
                autoclose: true,
                format: 'yyyy/mm/dd'
            });
            $('#datepicker1').datepicker({
                autoclose: true,
                format: 'yyyy/mm/dd'
            });

        });

	</script>
</body>
</html>
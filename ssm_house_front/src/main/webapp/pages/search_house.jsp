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
			<form action="${pageContext.request.contextPath}/house/findAllVacant" method="post">
				<table  id="qtable">
					<tr>
						<td>
							<div class="form-group">
								<label>入住日期：</label>

								<div class="input-group date">
									<div class="input-group-addon">
										<i class="fa fa-calendar"></i>
									</div>
									<input type="text" class="form-control pull-right" id="datepicker" name="comeTime">
								</div>
								<!-- /.input group -->
							</div>
						</td>
						<td>
							<div class="form-group">
								<label>离店日期：</label>

								<div class="input-group date">
									<div class="input-group-addon">
										<i class="fa fa-calendar"></i>
									</div>
									<input type="text" class="form-control pull-right" id="datepicker1" name="departureTime">
								</div>
								<!-- /.input group -->
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<center><input type="submit" value="搜索" class="btn btn-info "></center>
						</td>
					</tr>
				</table>


			</form>
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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>酒店订单管理系统</title>
	<link rel="stylesheet" type="text/css" href="../css/style1.css">
	<script src="../js/jquery-1.11.3.js"></script>
	<style>
	body{
		font-size: 14px;
	}
	.bfenlei:nth-of-type(2){
		background: rgb(131,142,222);
	}
	.ctable{
		margin-top: 20px;
		margin-bottom: 20px;
	}
	.ctable td{
		width:130px;
		height: 40px;
	}

	.pageNum {
		margin-top: 15px;
		width: 100%;
		overflow: hidden;
	}


	.pageNum ul li {
		width: 40px;
		height: 40px;
		float: left;
		border: 1px solid #eee;
		margin-right: 10px;
		text-align: center;
		line-height: 40px;
	}
	.pageNum ul li.curPage {
		background-color: #ffc900;
	}
	.pageNum ul li a {
		width: 100%;
		height: 100%;
		color: #000;
		font-size: 14px;
	}
	.pageNum ul .threeword {
		width: 75px;
	}

	</style>
</head>
<body>
	<div class="bbox">
		<jsp:include page="aside.jsp"></jsp:include>

		<div class="bright">

			<jsp:include page="header.jsp"></jsp:include>

			<h2><center>查询消费记录</center></h2>
			<div class="bbody">

				<table border="1" class="ctable">
					<tr>
						<td>序号</td>
						<td>房型</td>
						<td>订单金额</td>
						<td>入住日期</td>
						<td>离店日期</td>
						<td>订单状态</td>
						<td>下单时间</td>
					</tr>
					<c:forEach items="${pageInfo.list}" var="order" varStatus="status"  >
						<tr>
							<td>${(pageInfo.pageNum-1)*pageInfo.pageSize + status.index+1}</td>
							<td>${order.house.houseName}</td>
							<td>${order.orderPrice}</td>
							<td>${order.comeTimeStr}</td>
							<td>${order.departureTimeStr}</td>
							<td>${order.orderStatus}</td>
							<td>${order.orderTimeStr}</td>
						</tr>
					</c:forEach>
				</table>
				<div class="pull-left">
					<div class="form-group form-inline">
						总共${pageInfo.pages} 页，共<font color="red">${pageInfo.total}</font>条数据。 每页
					<select class="form-control" id="change" onchange="changePageSize()">
						<option value="1">请选择</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
						<option>6</option>
					</select> 条
					</div>
				</div>
				<div class="pageNum">
					<ul id="pageNum">
						<li><a href="${pageContext.request.contextPath}/order/findByMid?mid=${m1.mid}&page=1&size=${pageInfo.pageSize}">首页</a></li>
						<li class="threeword"><a href="${pageContext.request.contextPath}/order/findByMid?mid=${m1.mid}&page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a></li>
						<c:forEach begin="1" var="i" end="${pageInfo.pages}">
							<c:if test="${pageInfo.pageNum == i}">
								<a href="${pageContext.request.contextPath}/order/findByMid?mid=${m1.mid}&page=${i}&size=${pageInfo.pageSize}"><li class="curPage">${i}</li></a>
							</c:if>
							<c:if test="${pageInfo.pageNum != i}">
								<a href="${pageContext.request.contextPath}/order/findByMid?mid=${m1.mid}&page=${i}&size=${pageInfo.pageSize}"><li >${i}</li></a>
							</c:if>
						</c:forEach>
						<a href="${pageContext.request.contextPath}/order/findByMid?mid=${m1.mid}&page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}"><li class="threeword">下一页</li></a>
						<a href="${pageContext.request.contextPath}/order/findByMid?mid=${m1.mid}&page=${pageInfo.pages}&size=${pageInfo.pageSize}"><li class="threeword">末页</li></a>
					</ul>
				</div>
			</div>
			</div>
		</div>
	</div>
</body>
<script>

    function changePageSize(){
        //获取下拉框的值
        var pageSize = $("#change").val();
        //向服务器发送请求，改变每页显示条数
        location.href="${pageContext.request.contextPath}/order/findByMid?mid=${m1.mid}&page=1&size="+pageSize;
    }
</script>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        .khouse{
            border: 1px solid #666;
            height: 180px;
            width: 180px;
            float: left;
        }
        .kfx{
            font-size: 20px;
            width: 100%;
            height: 100px;
            /*border: 1px solid #000;*/
            text-align: center;
            line-height: 100px;
        }

    </style>
</head>
<body>
<div class="bbox">
    <jsp:include page="aside.jsp"></jsp:include>

    <div class="bright">

        <jsp:include page="header.jsp"></jsp:include>


        <h2><center>选择房间</center></h2>
        <div class="kbox">
            <c:forEach items="${houses}" var="house">
                <div class="khouse">
                    <div class="kfx">
                        <span>${house.houseName}</span>
                    </div>
                    <div class="kfx2">
                        <center><span>房间号:${house.houseNum}</span></center><br>
                        <center><button type="submit" class="btn btn-info" onclick="location.href='${pageContext.request.contextPath}/house/findById?hid=${house.hid}'">预定</button></center>
                    </div>
                </div>
            </c:forEach>

        </div>
    </div>
</div>
<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
<script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>

</body>
</html>
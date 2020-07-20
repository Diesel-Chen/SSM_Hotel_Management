<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            height: 190px;
            width: 190px;
            float: left;
        }
        .kfx{
            font-size: 20px;
            width: 100%;
            height: 60px;
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

        <h2><center>可选空房</center></h2>
        <div class="kbox">
            <c:forEach items="${houseList}" var="house">

                <div class="khouse">
                    <div class="kfx">
                        <span>${house.houseName}</span>
                    </div>
                    <div class="kfx2">
                        <center><span >剩余数量：${house.count}间</span></center><br>
                        <center><span>房间价格：¥${house.housePrice}</span></center><br>
                        <center><a href="${pageContext.request.contextPath}/house/findByName?houseName=${house.houseName}"><button class="btn btn-info ">预定</button></a></center>
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
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


        <h2><center>预定详情</center></h2>
        <div class="kbox">
            <form action="${pageContext.request.contextPath}/order/addOrder" method="post">
                <input type="hidden" value="${selectDate.comeTime}" name="comeTime">
                <input type="hidden" value="${selectDate.departureTime}" name="departureTime">
                <input type="hidden" value="待处理" name="orderStatus">
                <input type="hidden" value="${house.housePrice *selectDate.count}" name="orderPrice">
                <input type="hidden" value="${house.hid}" name="houseId">
                <input type="hidden" value="${member.mid}" name="memberId">
                <table border="1">
                    <tr>
                        <td colspan="2">${selectDate.comeTimeStr}-${selectDate.departureTimeStr} </td>
                    </tr>
                    <tr>
                        <td colspan="2">${house.houseName}</td>
                    </tr>
                    <tr>
                        <td>住客姓名</td>
                        <td>${member.realName}</td>
                    </tr>
                    <tr>
                        <td>身份证号</td>
                        <td>${member.identificationNum}</td>
                    </tr>
                    <tr>
                        <td>联系手机</td>
                        <td>${member.telephone}</td>
                    </tr>
                    <tr>
                        <td>房间号</td>
                        <td>${house.houseNum}</td>
                    </tr>
                    <tr>
                        <td>总价格</td>
                        <td>共<font color="red">${selectDate.count}</font>天&nbsp;&nbsp;&nbsp;<font color="red">¥${house.housePrice *selectDate.count }</font></td>
                    </tr>
                </table>
                <center><button type="submit" class="btn btn-info ">提交订单</button></center>
            </form>
        </div>
</div>
<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
<script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>

</body>
</html>
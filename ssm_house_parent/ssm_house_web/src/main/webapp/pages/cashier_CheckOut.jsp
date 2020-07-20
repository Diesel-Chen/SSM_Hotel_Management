<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

</body>
</html><!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">




    <title>数据 - AdminLTE2定制版</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">




    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- iCheck -->
    <!-- Morris chart -->
    <!-- jvectormap -->
    <!-- Date Picker -->
    <!-- Daterange picker -->
    <!-- Bootstrap time Picker -->
    <!--<link rel="stylesheet" href="../../../plugins/timepicker/bootstrap-timepicker.min.css">-->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--数据表格-->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- Bootstrap Color Picker -->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--bootstrap-markdown-->
    <!-- Theme style -->
    <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
    <!-- Ion Slider -->
    <!-- ion slider Nice -->
    <!-- bootstrap slider -->
    <!-- bootstrap-datetimepicker -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->








    <!-- jQuery 2.2.3 -->
    <!-- jQuery UI 1.11.4 -->
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <!-- Bootstrap 3.3.6 -->
    <!-- Morris.js charts -->
    <!-- Sparkline -->
    <!-- jvectormap -->
    <!-- jQuery Knob Chart -->
    <!-- daterangepicker -->
    <!-- datepicker -->
    <!-- Bootstrap WYSIHTML5 -->
    <!-- Slimscroll -->
    <!-- FastClick -->
    <!-- iCheck -->
    <!-- AdminLTE App -->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- bootstrap color picker -->
    <!-- bootstrap time picker -->
    <!--<script src="../../../plugins/timepicker/bootstrap-timepicker.min.js"></script>-->
    <!-- Bootstrap WYSIHTML5 -->
    <!--bootstrap-markdown-->
    <!-- CK Editor -->
    <!-- InputMask -->
    <!-- DataTables -->
    <!-- ChartJS 1.0.1 -->
    <!-- FLOT CHARTS -->
    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->
    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
    <!-- jQuery Knob -->
    <!-- Sparkline -->
    <!-- Morris.js charts -->
    <!-- Ion Slider -->
    <!-- Bootstrap slider -->
    <!-- bootstrap-datetimepicker -->
    <!-- 页面meta /-->

    <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="../plugins/morris/morris.css">
    <link rel="stylesheet" href="../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="../plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="../plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="../plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="../plugins/select2/select2.css">
    <link rel="stylesheet" href="../plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="../css/style2.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="../plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
    <style>

        .bbody{
            position: relative;
            /*border:1px solid #000;*/
            width: 1200px;
            height: 510px;
        }
        .bbleft{
            width: 900px;
            /*border:1px solid #000;*/
            height: 510px;
        }
        .bbright{
            /*border:1px solid #000;*/
            position: absolute;
            top: 0px;
            right: 0px;
            width: 230px;
            height: 510px;
        }
        .daohang{
            width: 900px;
            height: 45px;
            /*border: 1px solid #000;*/
        }
        .daohang ul{
            width: 900px;
            height: 45px;
        }
        .daohang ul li{
            width: 16.5%;
            height: 45px;
            border: 1px solid #666;
            float: left;
            list-style: none;
        }
        .daohang ul li a{
            display: block;
            text-align: center;
            line-height: 45px;
            height: 45px;
            color: #000;
        }
        .daohang ul li:hover{
            background: rgb(255,255,86);
        }
        .fdata{
            width: 900px;
            height: 600px;
            margin-left: 40px;
        }
        .btable td{
            width: 122px;
            height: 115px;
            background-image: linear-gradient(to right, rgb(114,181,254),#fff);
            text-align: center;
            font-size: 14px;
        }

        .bbright form{
            width: 220px;
            height: 150px;
            /*border: 1px solid #000;*/
        }
        form span{
            display: block;
            font-size: 14px;
            margin-left: 10px;
            margin-top: 10px;
        }
        .fanghao{
            position: absolute;
            top: 40px;
            left: 10px;
            width: 200px;
            /*background: red;*/
        }
        .fanghao input{
            width: 100px;
        }
        .state{
            position: absolute;
            top: 80px;
            left: 10px;
        }
        .state select{
            width: 105px;
        }
        .sousuo{
            position: absolute;
            left: 10px;
            top: 120px;
        }
        .sousuo input{
            width: 50px;
            margin-left: 90px;
        }
        .fxzt{
            width: 220px;
            height: 350px;
        }
        .fxzt li{
            list-style: none;
            position: relative;
            width: 200px;
            height: 30px;
            margin-bottom: 48px;
            margin-left: 10px;
        }

        .fangzt{
            width: 120px;
            height: 30px;
            border: 1px solid #000;
        }
        .fangzt1{
            background-image: linear-gradient(to right, rgb(114,181,254),#fff);
        }
        .fangzt2{
            background-image: linear-gradient(to right, #aaa,#fff);
        }
        .fangzt3{
            background-image: linear-gradient(to right, yellow,#fff);
        }
        .fangzt4{
            background-image: linear-gradient(to right, red,#fff);
        }
        .fangzt5{
            background-image: linear-gradient(to right, rgb(140,141,23),#fff);
        }
        .fangzt6{
            background-image: linear-gradient(to right, rgb(249,151,45),#fff);
        }
        .fangsl{
            position: absolute;
            top: 4px;
            right: 20px;
        }
        .fangzt span{
            display: block;
            font-size: 14px;
            line-height: 30px;
            height: 30px;
            text-align: center;
        }
        .syfj{
            float: left;
            position: relative;
            width: 122px;
            height: 115px;
            border: 1px solid #666;
            font-size: 14px;
        }
        .s1{
            text-align: center;
            display: block;
            position: absolute;
            width: 100%;
            height: 20px;
            top: 20px;
        }
        .s2{
            text-align: center;
            display: block;
            width: 100%;
            height: 30px;
            position: absolute;
            top: 42px;
        }
    </style>
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="admin_header.jsp"/>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <jsp:include page="admin_aside.jsp"/>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">
        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                前台收银管理
                <small>离店办理</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/pages/admin_main.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="${pageContext.request.contextPath}/pages/cashier_CheckIn.jsp">前台收银管理</a></li>
                <li class="active">离店办理</li>
            </ol>
        </section>
        <!-- 内容头部 /-->
        <section class="content">

            <div class="bbody">
                <div class="bbleft">
                    <div class="fdata">
                        <c:forEach items="${houseList}" var="h">
                            <c:if test="${h.houseState eq '空房' }">
                                <div class="syfj" style="background-image: linear-gradient(to right, rgb(114,181,254),#fff);">
                                    <span class="s1">${h.houseNum }</span><span class="s2">${h.houseName }</span>
                                </div>
                            </c:if>
                            <c:if test="${h.houseState eq '脏房' }">
                                <div class="syfj" style="background-image: linear-gradient(to right, #aaa,#fff);">
                                    <span class="s1">${h.houseNum }</span><span class="s2">${h.houseName }</span>
                                </div>
                            </c:if>
                            <c:if test="${h.houseState eq '预订' }">
                                <div class="syfj" style="background-image: linear-gradient(to right, yellow,#fff);">
                                    <span class="s1">${h.houseNum }</span><span class="s2">${h.houseName }</span>
                                </div>
                            </c:if>
                            <c:if test="${h.houseState eq '住人' }">
                                <div class="syfj" style="background-image:linear-gradient(to right, #ff5151,#fff);">
                                    <span class="s1">${h.houseNum }</span><span class="s2">${h.houseName }<a href="${pageContext.request.contextPath}/house/updateToDirty?hid=${h.hid}"><br>离店办理</a></span>
                                </div>
                            </c:if>
                        </c:forEach>
                    </div>
                </div>

            </div>
        </section>
    </div>

    <!-- 底部导航 -->
    <footer class="main-footer">
        <div class="pull-right houseNumden-xs">
            <b>Version</b> 1.0.8
        </div>
        <strong>Copyright &copy; 2014-2017 <a href="">Diesel_晨研发部</a>.</strong> All rights reserved.
    </footer>
    <!-- 底部导航 /-->

</div>


<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="../plugins/raphael/raphael-min.js"></script>
<script src="../plugins/morris/morris.min.js"></script>
<script src="../plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="../plugins/knob/jquery.knob.js"></script>
<script src="../plugins/daterangepicker/moment.min.js"></script>
<script src="../plugins/daterangepicker/daterangepicker.js"></script>
<script src="../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="../plugins/fastclick/fastclick.js"></script>
<script src="../plugins/iCheck/icheck.min.js"></script>
<script src="../plugins/adminLTE/js/app.min.js"></script>
<script src="../plugins/treeTable/jquery.treetable.js"></script>
<script src="../plugins/select2/select2.full.min.js"></script>
<script src="../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="../plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="../plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="../plugins/ckeditor/ckeditor.js"></script>
<script src="../plugins/input-mask/jquery.inputmask.js"></script>
<script src="../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="../plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="../plugins/datatables/jquery.dataTables.min.js"></script>
<script src="../plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="../plugins/chartjs/Chart.min.js"></script>
<script src="../plugins/flot/jquery.flot.min.js"></script>
<script src="../plugins/flot/jquery.flot.resize.min.js"></script>
<script src="../plugins/flot/jquery.flot.pie.min.js"></script>
<script src="../plugins/flot/jquery.flot.categories.min.js"></script>
<script src="../plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="../plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script src="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script>
    $(document).ready(function() {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });


    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }


    $(document).ready(function() {
        $('#datepicker-a3').datepicker({
            autoclose: true,
            language: 'zh-CN'
        });
    });


    $(document).ready(function() {
        $('#datepicker-a6').datepicker({
            autoclose: true,
            language: 'zh-CN'
        });
    });


    $(document).ready(function() {
        // 激活导航位置
        setSidebarActive("order-manage");
    });
</script>
</body>

</html>
<!---->
/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2020-06-06 05:16:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fadd_005fmember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html><!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- 页面meta -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>数据 - AdminLTE2定制版</title>\r\n");
      out.write("    <meta name=\"description\" content=\"AdminLTE2定制版\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"AdminLTE2定制版\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <!-- Ionicons -->\r\n");
      out.write("    <!-- iCheck -->\r\n");
      out.write("    <!-- Morris chart -->\r\n");
      out.write("    <!-- jvectormap -->\r\n");
      out.write("    <!-- Date Picker -->\r\n");
      out.write("    <!-- Daterange picker -->\r\n");
      out.write("    <!-- Bootstrap time Picker -->\r\n");
      out.write("    <!--<link rel=\"stylesheet\" href=\"../../../plugins/timepicker/bootstrap-timepicker.min.css\">-->\r\n");
      out.write("    <!-- bootstrap wysihtml5 - text editor -->\r\n");
      out.write("    <!--数据表格-->\r\n");
      out.write("    <!-- 表格树 -->\r\n");
      out.write("    <!-- select2 -->\r\n");
      out.write("    <!-- Bootstrap Color Picker -->\r\n");
      out.write("    <!-- bootstrap wysihtml5 - text editor -->\r\n");
      out.write("    <!--bootstrap-markdown-->\r\n");
      out.write("    <!-- Theme style -->\r\n");
      out.write("    <!-- AdminLTE Skins. Choose a skin from the css/skins\r\n");
      out.write("       folder instead of downloading all of them to reduce the load. -->\r\n");
      out.write("    <!-- Ion Slider -->\r\n");
      out.write("    <!-- ion slider Nice -->\r\n");
      out.write("    <!-- bootstrap slider -->\r\n");
      out.write("    <!-- bootstrap-datetimepicker -->\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery 2.2.3 -->\r\n");
      out.write("    <!-- jQuery UI 1.11.4 -->\r\n");
      out.write("    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("    <!-- Morris.js charts -->\r\n");
      out.write("    <!-- Sparkline -->\r\n");
      out.write("    <!-- jvectormap -->\r\n");
      out.write("    <!-- jQuery Knob Chart -->\r\n");
      out.write("    <!-- daterangepicker -->\r\n");
      out.write("    <!-- datepicker -->\r\n");
      out.write("    <!-- Bootstrap WYSIHTML5 -->\r\n");
      out.write("    <!-- Slimscroll -->\r\n");
      out.write("    <!-- FastClick -->\r\n");
      out.write("    <!-- iCheck -->\r\n");
      out.write("    <!-- AdminLTE App -->\r\n");
      out.write("    <!-- 表格树 -->\r\n");
      out.write("    <!-- select2 -->\r\n");
      out.write("    <!-- bootstrap color picker -->\r\n");
      out.write("    <!-- bootstrap time picker -->\r\n");
      out.write("    <!--<script src=\"../../../plugins/timepicker/bootstrap-timepicker.min.js\"></script>-->\r\n");
      out.write("    <!-- Bootstrap WYSIHTML5 -->\r\n");
      out.write("    <!--bootstrap-markdown-->\r\n");
      out.write("    <!-- CK Editor -->\r\n");
      out.write("    <!-- InputMask -->\r\n");
      out.write("    <!-- DataTables -->\r\n");
      out.write("    <!-- ChartJS 1.0.1 -->\r\n");
      out.write("    <!-- FLOT CHARTS -->\r\n");
      out.write("    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->\r\n");
      out.write("    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->\r\n");
      out.write("    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->\r\n");
      out.write("    <!-- jQuery Knob -->\r\n");
      out.write("    <!-- Sparkline -->\r\n");
      out.write("    <!-- Morris.js charts -->\r\n");
      out.write("    <!-- Ion Slider -->\r\n");
      out.write("    <!-- Bootstrap slider -->\r\n");
      out.write("    <!-- bootstrap-datetimepicker -->\r\n");
      out.write("    <!-- 页面meta /-->\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/ionicons/css/ionicons.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/iCheck/square/blue.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/morris/morris.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/datepicker/datepicker3.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/datatables/dataTables.bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/treeTable/jquery.treetable.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/treeTable/jquery.treetable.theme.default.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/select2/select2.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/colorpicker/bootstrap-colorpicker.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/adminLTE/css/AdminLTE.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/adminLTE/css/skins/_all-skins.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style2.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/ionslider/ion.rangeSlider.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/ionslider/ion.rangeSlider.skinNice.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-slider/slider.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"hold-transition skin-purple sidebar-mini\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("    <!-- 页面头部 -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin_header.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- 页面头部 /-->\r\n");
      out.write("\r\n");
      out.write("    <!-- 导航侧栏 -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin_aside.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- 导航侧栏 /-->\r\n");
      out.write("\r\n");
      out.write("    <!-- 内容区域 -->\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("        <!-- 内容头部 -->\r\n");
      out.write("        <section class=\"content-header\">\r\n");
      out.write("            <h1>\r\n");
      out.write("                会员信息管理\r\n");
      out.write("                <small>会员信息添加</small>\r\n");
      out.write("            </h1>\r\n");
      out.write("            <ol class=\"breadcrumb\">\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pages/admin_main.jsp\"><i class=\"fa fa-dashboard\"></i> 首页</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pages/admin_add_member.jsp\">会员信息管理</a></li>\r\n");
      out.write("                <li class=\"active\">会员信息添加</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- 内容头部 /-->\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/member/addMember\" method=\"post\">\r\n");
      out.write("                <div class=\"panel panel-default mytab\">\r\n");
      out.write("                    <div class=\"panel-heading\">添加会员信息</div>\r\n");
      out.write("                    <div class=\"row data-type\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">会员号</div>\r\n");
      out.write("                        <div class=\"col-md-10 data text\">\r\n");
      out.write("                            <input type=\"text\" name=\"userName\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">密码:</div>\r\n");
      out.write("                        <div class=\"col-md-10 data\">\r\n");
      out.write("                            <input type=\"password\" name=\"passWord\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">昵称:</div>\r\n");
      out.write("                        <div class=\"col-md-10 data text\">\r\n");
      out.write("                            <input type=\"text\" name=\"nickName\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">姓名:</div>\r\n");
      out.write("                        <div class=\"col-md-10 data text\">\r\n");
      out.write("                            <input type=\"text\" name=\"realName\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">性别:</div>\r\n");
      out.write("                        <div class=\"col-md-10 data line-height36\">\r\n");
      out.write("                            <div class=\"form-group form-inline\">\r\n");
      out.write("                                <select name=\"sex\">\r\n");
      out.write("                                    <option value=\"男\">男</option>\r\n");
      out.write("                                    <option value=\"女\">女</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">联系手机:</div>\r\n");
      out.write("                        <div class=\"col-md-10 data text\">\r\n");
      out.write("                            <input type=\"text\" name=\"telephone\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">身份证号:</div>\r\n");
      out.write("                        <div class=\"col-md-10 data text\">\r\n");
      out.write("                            <input type=\"text\" name=\"identificationNum\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">电子邮箱:</div>\r\n");
      out.write("                        <div class=\"col-md-10 data text\">\r\n");
      out.write("                            <input type=\"text\" name=\"email\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\"></div>\r\n");
      out.write("                        <div class=\"col-md-10 data line-height36\">\r\n");
      out.write("                            <input value=\"提交\" type=\"submit\" class=\"btn btn-info\" ></input>\r\n");
      out.write("                            <input value=\"重置\" type=\"reset\" class=\"btn btn-info\" ></input>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 底部导航 -->\r\n");
      out.write("    <footer class=\"main-footer\">\r\n");
      out.write("        <div class=\"pull-right hidden-xs\">\r\n");
      out.write("            <b>Version</b> 1.0.8\r\n");
      out.write("        </div>\r\n");
      out.write("        <strong>Copyright &copy; 2014-2017 <a href=\"\">Diesel_晨研发部</a>.</strong> All rights reserved.\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- 底部导航 /-->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/jQueryUI/jquery-ui.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/raphael/raphael-min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/morris/morris.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("<script src=\"../plugins/knob/jquery.knob.js\"></script>\r\n");
      out.write("<script src=\"../plugins/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<script src=\"../plugins/daterangepicker/daterangepicker.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("<script src=\"../plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/adminLTE/js/app.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/treeTable/jquery.treetable.js\"></script>\r\n");
      out.write("<script src=\"../plugins/select2/select2.full.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/colorpicker/bootstrap-colorpicker.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/bootstrap-markdown.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/markdown.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/to-markdown.js\"></script>\r\n");
      out.write("<script src=\"../plugins/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.js\"></script>\r\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.date.extensions.js\"></script>\r\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.extensions.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datatables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/chartjs/Chart.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.resize.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.pie.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.categories.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/ionslider/ion.rangeSlider.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-slider/bootstrap-slider.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        // 选择框\r\n");
      out.write("        $(\".select2\").select2();\r\n");
      out.write("\r\n");
      out.write("        // WYSIHTML5编辑器\r\n");
      out.write("        $(\".textarea\").wysihtml5({\r\n");
      out.write("            locale: 'zh-CN'\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // 设置激活菜单\r\n");
      out.write("    function setSidebarActive(tagUri) {\r\n");
      out.write("        var liObj = $(\"#\" + tagUri);\r\n");
      out.write("        if (liObj.length > 0) {\r\n");
      out.write("            liObj.parent().parent().addClass(\"active\");\r\n");
      out.write("            liObj.addClass(\"active\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        $('#datepicker-a3').datepicker({\r\n");
      out.write("            autoclose: true,\r\n");
      out.write("            language: 'zh-CN'\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        $('#datepicker-a6').datepicker({\r\n");
      out.write("            autoclose: true,\r\n");
      out.write("            language: 'zh-CN'\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        // 激活导航位置\r\n");
      out.write("        setSidebarActive(\"order-manage\");\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<!---->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

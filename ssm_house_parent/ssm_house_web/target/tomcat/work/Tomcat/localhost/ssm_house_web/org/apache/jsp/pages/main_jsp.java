/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2020-06-06 05:25:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>酒店订单管理系统</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style1.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../plugins/ionicons/css/ionicons.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../plugins/datepicker/datepicker3.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.nav ul li:nth-of-type(3){\r\n");
      out.write("\t\t\tbackground: rgb(255,255,86);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.bfenlei:nth-of-type(1){\r\n");
      out.write("\t\t\tbackground: rgb(131,142,222);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#qtable{\r\n");
      out.write("\t\t\tmargin-top: 50px;\r\n");
      out.write("\t\t\tmargin-left: 180px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#qtable td{\r\n");
      out.write("\t\t\theight: 70px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.bimg{\r\n");
      out.write("\t\t\tmargin-top: 50px;\r\n");
      out.write("\t\t\theight: 300px;\r\n");
      out.write("\t\t\tmargin-left: 300px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"bbox\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "aside.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"bright\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t<h2><center>首页</center></h2>\r\n");
      out.write("\t\t\t<img src=\"../img/back.png\" class=\"bimg\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("\t<script src=\"../plugins/jQueryUI/jquery-ui.min.js\"></script>\r\n");
      out.write("\t<script src=\"../plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t<script src=\"../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\t$()\r\n");
      out.write("        $(function() {\r\n");
      out.write("\r\n");
      out.write("            //Date picker\r\n");
      out.write("            $('#datepicker').datepicker({\r\n");
      out.write("                autoclose: true,\r\n");
      out.write("                format: 'yyyy/mm/dd'\r\n");
      out.write("            });\r\n");
      out.write("            $('#datepicker1').datepicker({\r\n");
      out.write("                autoclose: true,\r\n");
      out.write("                format: 'yyyy/mm/dd'\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

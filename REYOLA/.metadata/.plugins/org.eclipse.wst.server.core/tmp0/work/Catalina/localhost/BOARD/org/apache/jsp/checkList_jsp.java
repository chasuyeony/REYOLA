/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2018-06-21 14:56:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\t\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>AM I YOLO?</title>\r\n");
      out.write("\t\t<link href=\"css/new.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<link href=\"css/index_css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"http://fonts.googleapis.com/earlyaccess/hanna.css\">\r\n");
      out.write("\t\t\r\n");
      out.write("    <style>\r\n");
      out.write("      body {\r\n");
      out.write("        font-family: 'Hanna', serif;\r\n");
      out.write("      }\r\n");
      out.write("        \r\n");
      out.write("    .btn {\r\n");
      out.write("  -webkit-border-radius: 28;\r\n");
      out.write("  -moz-border-radius: 28;\r\n");
      out.write("  border-radius: 28px;\r\n");
      out.write("  font-family: Arial;\r\n");
      out.write("  color: #000000;\r\n");
      out.write("  font-size: 20px;\r\n");
      out.write("  background: #fffc2e;\r\n");
      out.write("  padding: 10px 20px 10px 20px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  margin:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover {\r\n");
      out.write("  background: #ffdd00;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--  style=\"background:url(sky.jpg) no-repeat fixed 50%;\" -->\r\n");
      out.write("<div style=\"margin:0px 15%; padding:3% 20px; line-height:200%; \">\r\n");
      out.write("\t\t\t\t\t\t<h2 style=\"height: auto; width: 100%; border-left:5px solid rgb(255, 217, 0);\">&nbsp&nbsp당신은 욜로족인가요?</h2>\r\n");
      out.write("\t\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"saveYOLO.jsp\" style=\"height: auto; width: 100%; border-bottom:3px solid gold; font-size:15pt;\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"name\">이름/별명</label><input type=\"text\" name=\"name\" id=\"name\" required><br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\">나는 하루에 10번 이상 <b>지금</b> 난 행복한지 생각해본다.<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\">지금 죽도록 공부해서 커서 행복하게 살고 싶다기보다는, 하루하루를 <b>놀면서 행복했으면</b> 좋겠다.<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\">항상 <b>나의 행복이 우선</b>이다. 내가 행복하지 않으면 하지 않는다.<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\">난 욜로족을 <b>선망</b>해왔고, 꼭 그런 인생을 살아보고 싶다.<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\">뒷일은 생각하지 않고 <b>오직 현실에만 충실</b>하게 살고 싶다.<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\">나의 가치는 미래에 대한 준비나 타인을 위한 희생 대신 <b>현재 내가 즐길 수 있는 행복</b>이 최고의 가치이다.<br>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\">하고 싶으면 <b>하고 본다</b><br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\">일이 <b>인생의 전부</b>가 될 수는 없다!<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                            <input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\"><b>언제라도</b> 여행을 떠날 준비가 되어있다.<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"think\" value=\"1\" class=\"\">그래도 가장 중요한 건 <b>할땐 하고 놀땐 노는 마음</b>이다.<br>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"제출\" class=\"btn\">\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("<br><br>\r\n");
      out.write("\t\t\t\t\t\t\t<p><br>현실을 중요하게 생각하는 것은 참 중요하지만, <b>미래</b>가 현재가 된다는 사실도 잊지 마세요!</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</body>\r\n");
      out.write("                        </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

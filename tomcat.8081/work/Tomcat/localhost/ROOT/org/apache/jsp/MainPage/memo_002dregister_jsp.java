/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2023-11-28 01:36:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.MainPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memo_002dregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/reset-css@5.0.2/reset.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://getbootstrap.com/docs/5.3/assets/css/docs.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"../css/Common.css\">\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        textarea {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 6.25em;\r\n");
      out.write("            border: none;\r\n");
      out.write("            resize: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .fullScreen{\r\n");
      out.write("            background: #f3f3f3;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .fullScreen .web-so{\r\n");
      out.write("            width: 25%;\r\n");
      out.write("            margin: 9rem auto;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .fullScreen .web-so .so-register{\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-flow: row wrap; justify-content: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .fullScreen .web-so .so-register .px-4{\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            margin: 2.5rem 0;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .fullScreen .web-so .so-register .px-4 .mb-3 {\r\n");
      out.write("            padding-bottom: 5%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .fullScreen .web-so .so-register .px-4 .mb-3:last-child{\r\n");
      out.write("            display: flex; flex-flow: row wrap;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /*.fullScreen .web-so .so-register .cnsu-logo{*/\r\n");
      out.write("        /*    background: url(\"https://i.namu.wiki/i/8-appfHuJ_E2TrT83RDobLOh7O0dhLeFVvsC-1C_i9-mcycmpnFkDw_LBp-u5PsLO4G-n9NezdM1aDIB-e2YgQ.svg\") no-repeat center/contain;*/\r\n");
      out.write("\r\n");
      out.write("        /*    width: 15vw; height: 10vh;*/\r\n");
      out.write("        /*    margin: auto;*/\r\n");
      out.write("        /*}*/\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <title>jsp study</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

    System.out.println(session.getAttribute("id"));


      out.write("\r\n");
      out.write("<div class=\"fullScreen p-3 m-0 border-0 bd-example m-0 border-0\">\r\n");
      out.write("    <div class=\"dropdown-menu web-so\">\r\n");
      out.write("        <div class=\"so-register\">\r\n");
      out.write("            <form method=\"post\" action=\"AddMemo\" class=\"px-4 py-3\">\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"date\" class=\"form-label\">날짜</label>\r\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"date\" name=\"date\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"memo\" class=\"form-label\">메모내용</label>\r\n");
      out.write("                    <textarea type=\"text\" class=\"form-control\" id=\"memo\" name=\"memo\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"submit\"  value=\"신청\" class=\"btn btn-primary\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

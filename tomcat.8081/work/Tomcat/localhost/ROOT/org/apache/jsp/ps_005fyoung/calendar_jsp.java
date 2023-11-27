/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2023-11-27 10:07:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ps_005fyoung;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Calendar");
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


    request.setCharacterEncoding("utf-8");

    Calendar cal = Calendar.getInstance();

    // 시스템 오늘날짜
    int ty = cal.get(Calendar.YEAR);
    int tm = cal.get(Calendar.MONTH)+1;
    int td = cal.get(Calendar.DATE);

    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH)+1;

    // 파라미터 받기
    String sy = request.getParameter("year");
    String sm = request.getParameter("month");

    if(sy!=null) { // 넘어온 파라미터가 있으면
        year = Integer.parseInt(sy);
    }
    if(sm!=null) {
        month = Integer.parseInt(sm);
    }

    cal.set(year, month-1, 1);
    year = cal.get(Calendar.YEAR);
    month = cal.get(Calendar.MONTH)+1;

    int week = cal.get(Calendar.DAY_OF_WEEK); // 1(일)~7(토)

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Insert title here</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"data:;base64,iVBORw0KGgo=\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        *{\r\n");
      out.write("            margin: 0; padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            font-family: \"맑은 고딕\", 나눔고딕, 돋움, sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        a {\r\n");
      out.write("            color: #000;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("        a:active, a:hover {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("            color: #F28011;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .calendar {\r\n");
      out.write("            width: 90%;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            margin: 30px auto;\r\n");
      out.write("        }\r\n");
      out.write("        .calendar .title{\r\n");
      out.write("            height: 37px;\r\n");
      out.write("            line-height: 37px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .calendar .selectField {\r\n");
      out.write("            border: 1px solid #999;\r\n");
      out.write("            padding: 2px 7px;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            font-family: \"맑은 고딕\", 나눔고딕, 돋움, sans-serif;\r\n");
      out.write("            vertical-align: baseline;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .calendar table {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            border-spacing: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .calendar table thead tr:first-child{\r\n");
      out.write("            background: #f6f6f6;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .calendar table td{\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .calendar table tbody td:hover{\r\n");
      out.write("            background: #919191;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .calendar table td:nth-child(7n+1){\r\n");
      out.write("            color: red;\r\n");
      out.write("        }\r\n");
      out.write("        .calendar table td:nth-child(7n){\r\n");
      out.write("            color: blue;\r\n");
      out.write("        }\r\n");
      out.write("        .calendar table td.gray {\r\n");
      out.write("            color: #ccc;\r\n");
      out.write("        }\r\n");
      out.write("        .calendar table td.today{\r\n");
      out.write("            font-weight:700;\r\n");
      out.write("            background: #E6FFFF;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .calendar .footer{\r\n");
      out.write("            height: 25px;\r\n");
      out.write("            line-height: 25px;\r\n");
      out.write("            text-align: right;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var pos = 0;\r\n");
      out.write("        function change() {\r\n");
      out.write("            var f = document.frm;\r\n");
      out.write("            f.action=\"MainPage.jsp\";\r\n");
      out.write("            f.submit();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function MouseClickEvent(obj) {\r\n");
      out.write("            if (pos)\r\n");
      out.write("                pos.style.background = \"\";\r\n");
      out.write("            obj.style.background = \"rgb(255,129,129)\";\r\n");
      out.write("            if (pos.className === \"today\")\r\n");
      out.write("                pos.style.background = \"rgb(230,255,255)\";\r\n");
      out.write("            pos = obj;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"calendar\">\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("        <form name=\"frm\" method=\"post\">\r\n");
      out.write("            <select name=\"year\" class=\"selectField\" onchange=\"change()\">\r\n");
      out.write("                ");
 for(int i=year-5; i<=year+5; i++){ 
      out.write("<option value=\"");
      out.print(i);
      out.write('"');
      out.write(' ');
      out.print(year==i?"selected='selected'":"" );
      out.write('>');
      out.print(i);
      out.write("년</option>\r\n");
      out.write("                ");
} 
      out.write("</select>\r\n");
      out.write("            <select name=\"month\" class=\"selectField\" onchange=\"change()\">\r\n");
      out.write("                ");
 for(int i=1; i<=12; i++){ 
      out.write("<option value=\"");
      out.print(i);
      out.write('"');
      out.write(' ');
      out.print(month==i?"selected='selected'":"" );
      out.write('>');
      out.print(i);
      out.write("월</option>\r\n");
      out.write("                ");
} 
      out.write("</select>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <table>\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>일</td>\r\n");
      out.write("            <td>월</td>\r\n");
      out.write("            <td>화</td>\r\n");
      out.write("            <td>수</td>\r\n");
      out.write("            <td>목</td>\r\n");
      out.write("            <td>금</td>\r\n");
      out.write("            <td>토</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        ");

            // 1일 앞 달
            Calendar preCal = (Calendar)cal.clone();
            preCal.add(Calendar.DATE, -(week-1));
            int preDate = preCal.get(Calendar.DATE);

            out.print("<tr>");
            // 1일 앞 부분
            for(int i=1; i<week; i++) {
                //out.print("<td> </td>");
                out.print("<td class='gray' onclick='MouseClickEvent(this)'>"+(preDate++)+"</td>");
            }

            // 1일부터 말일까지 출력
            int lastDay = cal.getActualMaximum(Calendar.DATE);
            String cls;
            for(int i=1; i<=lastDay; i++) {
                cls = year==ty && month==tm && i==td ? "today":"";

                out.print("<td class='"+cls+"'onclick='MouseClickEvent(this)'>"+i+"</td>");
                if(lastDay != i && (++week)%7 == 1) {
                    out.print("</tr><tr>");
                }
            }

            // 마지막 주 마지막 일자 다음 처리
            int n = 1;
            for(int i = (week-1)%7; i<6; i++) {
                // out.print("<td> </td>");
                out.print("<td class='gray' onclick='MouseClickEvent(this)'>"+(n++)+"</td>");
            }
            out.print("</tr>");
        
      out.write("</tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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

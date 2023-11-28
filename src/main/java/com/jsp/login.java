package com.jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import static db.DBConnect.select;


@WebServlet("/ps_young/loginPro")
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

        String id = request.getParameter("id");
        String password = request.getParameter("password");
        Map<String, Object> userInfo = select(id, password);
        if (userInfo == null){
            PrintWriter out = response.getWriter();
            out.println("<script language='javascript'>'");
            out.println("alert('아이디 혹은 비밀번호를 잘못입력하셨습니다!')");
            out.println("</script>");
            response.sendRedirect("../ps_young/usr-login.jsp");
        }else{
            request.getSession().setAttribute("name",userInfo.get("name"));
            request.getSession().setAttribute("id",id);
            request.getSession().setAttribute("room_Number",userInfo.get("room_Number"));
            System.out.println("userInfo = " + userInfo.get("name"));
            response.sendRedirect("../MainPage/MainPage.jsp");
        }

    }
}

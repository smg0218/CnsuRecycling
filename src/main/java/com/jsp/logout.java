package com.jsp;

import org.apache.catalina.Session;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import static db.DBConnect.select;


@WebServlet("/MainPage/logout")

public class logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        System.out.println("여기로왔음");

        HttpSession session = request.getSession(false);

        if (session != null) {
            // 세션을 삭제합니다.
            session.invalidate();
            System.out.println("세션 삭제 완료");

        } else {
            response.getWriter().println("세션이 이미 없습니다.");
        }

        response.sendRedirect("/ps_young/usr-login.jsp");

    }


}

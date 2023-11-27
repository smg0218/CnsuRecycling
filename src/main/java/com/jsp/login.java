package com.jsp;

import db.DBRepository;
import db.UserInfo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Map;

@WebServlet("/ps_young/loginPro")
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

        String id = request.getParameter("id");
        String password = request.getParameter("password");
        UserInfo userInfo = DBRepository.select(id, password);
        if (userInfo.getId()==null){
            System.out.println("login if문 트루");
        }else{
            request.getSession().setAttribute("name",userInfo.getName());
            request.getSession().setAttribute("id",userInfo.getId());
            request.getSession().setAttribute("room_Number",userInfo.getRoom_Number());
            System.out.println("userInfo = " + userInfo.getName());
            response.sendRedirect("../MainPage/MainPage.jsp");
        }

    }
}

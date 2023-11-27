package com.jsp;

import db.DBRepository;
import db.UserInfo;

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

        String id=request.getParameter("id");
        String password = request.getParameter("password");
        Map<String, UserInfo> userInfo = DBRepository.select(id, password);
        if (userInfo.get("name")==null){

        }else{
            request.getSession().setAttribute("name",userInfo.get("name"));
            request.getSession().setAttribute("id",userInfo.get("id"));
            request.getSession().setAttribute("room_Number",userInfo.get("room_Number"));
            System.out.println("userInfo = " + userInfo.get("name"));
            response.sendRedirect("../MainPage/MainPage.jsp");
        }

    }
}

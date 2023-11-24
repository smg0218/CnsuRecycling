package com.jsp;

import db.DBConnect;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

import static db.DBConnect.select;


@WebServlet("/loginPro")
public class loginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        String password = request.getParameter("password");
        String name = select(id, password);
        if (name==null){

        }else{
            request.getSession().setAttribute("name",name);
        }


    }


}

package com.jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

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
        String name = select(id, password);
        if (name==null){

        }else{
            request.getSession().setAttribute("name",name);











//            PrintWriter out = response.getWriter();
//            out.print(name);
        }

    }
}

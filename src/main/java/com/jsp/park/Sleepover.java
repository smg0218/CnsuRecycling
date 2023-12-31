package com.jsp.park;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static db.DBConnect.select;

@WebServlet("/MainPage/Sleepover")
public class Sleepover extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

        String id = request.getSession().getAttribute("id").toString();
        int room_Number = Integer.parseInt(request.getSession().getAttribute("room_Number").toString());

        String Start_date = request.getParameter("Start_date");
        String End_date=request.getParameter("End_date");
        String Reason= request.getParameter("Reason");

        Application ap = new Application();
        Post post = new Post(room_Number, Start_date,End_date,Reason);
        ap.addSleepover(post, id);

        response.sendRedirect("../MainPage/MainPage.jsp");

    }
}

package com.jsp.smg;

import db.DBRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/MainPage/AddMemo")
public class AddMemo extends HttpServlet{
    private static final Connection conn = DBUtils.getConnection();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

        String id = request.getParameter("id");
        String date = request.getParameter("date");
        String NewMemo = request.getParameter("memo");

        System.out.println("date = " + date);
        System.out.println("NewMemo = " + NewMemo);

        request.setAttribute("userid", DBRepository.userInfo.get("id"));
        request.getSession().setAttribute("memo_date",date);
        request.getSession().setAttribute("memo",NewMemo);

        System.out.println("id = " + id);
        System.out.println("date = " + date);
        System.out.println("NewMemo = " + NewMemo);

        MemoDAO.addMemo(new Memo(date, NewMemo), id);

        response.sendRedirect("../MainPage/MainPage.jsp");
    }
}

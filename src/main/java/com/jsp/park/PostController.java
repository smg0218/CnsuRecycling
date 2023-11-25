package com.jsp.park;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/post")
public class PostController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter(""));
        int room_Number = Integer.parseInt(request.getParameter(""));
        int date = Integer.parseInt(request.getParameter(""));
        String reason = request.getParameter("reason");


        Application board = new Application();
        Post post = new Post(id,room_Number,date,reason);
        board.addSleepover(post);

        response.sendRedirect("index.jsp");
    }
}
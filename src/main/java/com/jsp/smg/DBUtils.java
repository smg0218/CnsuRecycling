package com.jsp.smg;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/hackathon?serverTimezone=Asia/Seoul";
        String userName = "root";
        String password = "1234";
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("데이터베이스 연결 성공!");
        } catch (Exception e) {
            System.out.println("데이터베이스 연결 실패!");
            e.printStackTrace();
        }
        return conn;
    }
}

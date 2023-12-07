package com.jsp.park;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBC {
    public Connection DBC() {
        // 데이터베이스 연결 설정
        Connection con = null;
        String url = "jdbc:mysql://127.0.0.1:3306/hackathon";
        String driver = "com.mysql.cj.jdbc.Driver"; // 수정된 부분
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "1234");
            System.out.println("연결 성공");
        } catch (Exception e) {
            System.out.println("연결 실패");
            e.printStackTrace();
        }
        return con;
    }

}

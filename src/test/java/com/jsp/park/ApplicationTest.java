package com.jsp.park;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    @DisplayName("데이터를 조회해야 한다")
    void select(){

        DBC dbc = new DBC();
        Connection con = dbc.DBC();

        Application ap = new Application(con);

        ap.getSleepovers();

    }

    @Test
    @DisplayName("값을 넣어야 한다.")
    void inselt(){

        DBC dbc = new DBC();
        Connection con = dbc.DBC();

        // Application 인스턴스를 생성할 때 연결된 Connection을 전달
        Application ap = new Application(con);

        Post post = new Post(101, "20231212", "20231214", "살기싫음");

        ap.addSleepover(post);
    }



}
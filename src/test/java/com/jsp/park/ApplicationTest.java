package com.jsp.park;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    @DisplayName("값을 넣는 것에 성공해야한다.")
    void inselt(){

        Application ap = new Application();

        Post post = new Post(1,101,23,"살기싫음");

        ap.getSleepovers();

    }



}
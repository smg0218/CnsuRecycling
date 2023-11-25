package db;

import static db.DBConnect.select;

public class dbTest {
    public static void main(String[] args) {
        String isLogin = select("aaa1234", "1234");

        System.out.println("isLogin = " + isLogin);
    }
}

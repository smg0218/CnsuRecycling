package db;

import java.util.Map;

import static db.DBConnect.select;

public class dbTest {
    public static void main(String[] args) {
        Map<String, Object> info = select("aaa1234", "1234");

        System.out.println("isLogin = " + info.get("name"));
    }
}

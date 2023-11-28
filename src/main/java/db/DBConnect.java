package db;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DBConnect {


    private static Connection con;
    static String server = "localhost"; // 서버 주소
    static String user_name = "root"; //  접속자 id
    static String password = "1234"; // 접속자 pw

    public static void main(String[] args) {




//        String server = "localhost"; // 서버 주소
//        String user_name = "root"; //  접속자 id
//        String password = "1234"; // 접속자 pw

        // JDBC 드라이버 로드
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버를 로드하는데에 문제 발생" + e.getMessage());
            e.printStackTrace();
        }

        // 접속
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + ":3306/" + "?useSSL=false", user_name, password);
            System.out.println("연결 완료!");
        } catch(SQLException e) {
            System.err.println("연결 오류" + e.getMessage());
            e.printStackTrace();
        }

        // 접속 종료
        try {
            if(con != null)
                con.close();
        } catch (SQLException e) {}
    }

    public static Map<String, Object> select(String id, String pw){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select id, name, room_Number from hackathon.user where id = ? and password = ?";
        Map<String,Object> info= new HashMap();

        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + ":3306/" + "?useSSL=false", user_name, password);
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pw);
            rs=ps.executeQuery();
            if(rs.next()){
                info.put("id",rs.getString(1));
                info.put("name",rs.getString(2));
                info.put("room_Number",rs.getInt(3));
                return info;

            }else{
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

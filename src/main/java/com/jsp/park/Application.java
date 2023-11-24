package com.jsp.park;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Application {

    private Connection connection;

    public Application() {
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
    }


    // 글 목록 가져오기
    public List<Post> getSleepovers() {

        List<Post> sleepovers = new ArrayList<>();
        String sql = "SELECT * FROM sleepover WHERE approved = 1";

        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Post sleepover = new Post(resultSet.getInt("id"),
                        resultSet.getInt("room_Number"),
                        resultSet.getInt("date"),
                        resultSet.getString("reason"));
                sleepovers.add(sleepover);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sleepovers;
    }

    // 글 추가
    public void addSleepover(Post sleepover) {
        String sql = "INSERT INTO sleepover (id, room_Number, date, reason) VALUES (?,?,?,?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, sleepover.getId());
            statement.setInt(2, sleepover.getRoom_Number());
            statement.setInt(3, sleepover.getDate());
            statement.setString(4, sleepover.getReason());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

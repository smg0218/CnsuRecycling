package com.jsp.park;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Application {


    public Application(Connection connection) {
        this.connection = connection;
    }

    public Application() {
    }

    private Connection connection;


    // 글 목록 가져오기
    public List<Post> getSleepovers() {


        List<Post> sleepovers = new ArrayList<>();
        String sql = "SELECT * FROM sleepover";

        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Post sleepover = new Post(
                        resultSet.getInt("room_Number"),
                        resultSet.getString("date_start"),
                        resultSet.getString("date_end"),
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


        String sql = "INSERT INTO sleepover ( room_Number,date_start,date_end, reason) VALUES (?,?,?,?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, sleepover.getRoom_Number());
            statement.setString(2, sleepover.getStart_date());
            statement.setString(3, sleepover.getEnd_date());
            statement.setString(4, sleepover.getReason());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addSleepover(Post sleepover, String id) {


        String sql = "INSERT INTO sleepover ( user_id, room_Number,date_start,date_end, reason) VALUES (?,?,?,?,?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, id);
            statement.setInt(2, sleepover.getRoom_Number());
            statement.setString(3, sleepover.getStart_date());
            statement.setString(4, sleepover.getEnd_date());
            statement.setString(5, sleepover.getReason());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

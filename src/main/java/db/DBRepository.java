package db;

import com.jsp.smg.DBUtils;
import org.apache.catalina.User;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DBRepository {
    private static final Connection conn = DBUtils.getConnection();
    public static final UserInfo userInfo = new UserInfo();

    public static UserInfo select(String id, String pw) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select id, name, room_Number from hackathon.user where id=? and password=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pw);
            rs = ps.executeQuery();
            if (rs.next()) {
                userInfo.setId(rs.getString(1));
                userInfo.setName(rs.getString(2));
                userInfo.setRoom_Number(rs.getInt(3));
                return userInfo;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}

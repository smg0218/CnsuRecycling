package db;

import com.jsp.smg.DBUtils;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DBRepository {
    private static final Connection conn = DBUtils.getConnection();
    public static final Map<String, UserInfo> userInfo = new HashMap<>();

    public static Map<String, UserInfo> select(String id, String pw) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select id, name, room_Number from hackathon.user where id=? and password=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(1, pw);
            rs = ps.executeQuery();
            if (rs.next()) {
                userInfo.put(id, new UserInfo(rs.getString(1), rs.getString(2), rs.getInt(3)));
                return userInfo;

            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

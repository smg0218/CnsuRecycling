package com.jsp.smg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemoDAO {
    private static Connection conn = DBUtils.getConnection();

    public static List<Memo> allMemoList() {
        List<Memo> memoList = new ArrayList<>();
        String sql = "select * from calendarmemo where userid='201916011'";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Memo memo = new Memo();
                memo.setDate(rs.getString("memo_date"));
                memo.setMemo(rs.getString("memo"));
                memoList.add(memo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return memoList;
    }

    public static void addMemo(Memo memo) {
        String sql = "INSERT INTO calendarmemo (id, userid, memo_date, memo) VALUES (null, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, "201916011"); // 학번
            stmt.setString(2, memo.getDate()); // 날짜
            stmt.setString(3, memo.getMemo()); // 메모내용
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void removeMemo(String date) {
        String sql = "delete from calendarmemo where memo_date = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, date);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

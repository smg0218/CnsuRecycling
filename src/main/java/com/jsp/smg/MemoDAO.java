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

    //모든 메모를 가져오는 부분
    public static List<Memo> AllMemoList(String id) {
        List<Memo> memoList = new ArrayList<>();
        String sql = "select * from calendarmemo where user_id=?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, id); // 학번
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

        System.out.println("memoList = " + memoList);
        return memoList;
    }

    //추후에 학번에 맞는 메모만 가져오는 부분
    public static List<Memo> getMemoList(String id, String date) {
        List<Memo> memoList = new ArrayList<>();
        String sql = "select memo from calendarmemo where id=? and memo_date=?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, id); // 학번
            stmt.setString(1, date); // 날짜
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

    // 메모를 추가하는 부분
    public static void addMemo(Memo memo, String id) {
        String sql = "INSERT INTO calendarmemo (id, user_id, memo_date, memo) VALUES (null, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, id); // 학번
            stmt.setString(2, memo.getDate()); // 날짜
            stmt.setString(3, memo.getMemo()); // 메모내용
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //메모를 삭제하는 부분
    public static void removeMemo(String date, String id) {
        String sql = "delete from calendarmemo where memo_date = ? and user_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, date);
            stmt.setString(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

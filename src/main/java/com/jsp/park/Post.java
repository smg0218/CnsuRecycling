package com.jsp.park;

public class Post {

    private int id;
    private int room_Number;
    private int date;
    private String reason;

    public Post(int id, int room_Number, int date, String reason) {
        this.id = id;
        this.room_Number = room_Number;
        this.date = date;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoom_Number() {
        return room_Number;
    }

    public void setRoom_Number(int room_Number) {
        this.room_Number = room_Number;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", room_Number=" + room_Number +
                ", date=" + date +
                ", reason='" + reason + '\'' +
                '}';
    }
}

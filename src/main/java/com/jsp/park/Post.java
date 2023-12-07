package com.jsp.park;

public class Post {

    private int room_Number;
    private String start_date;
    private String end_date;
    private String reason;

    @Override
    public String toString() {
        return "Post{" +
                "room_Number=" + room_Number +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public Post(int room_Number, String start_date, String end_date, String reason) {
        this.room_Number = room_Number;
        this.start_date = start_date;
        this.end_date = end_date;
        this.reason = reason;
    }

    public int getRoom_Number() {
        return room_Number;
    }

    public void setRoom_Number(int room_Number) {
        this.room_Number = room_Number;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

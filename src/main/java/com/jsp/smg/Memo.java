package com.jsp.smg;

import java.util.Date;
import java.util.Objects;

public class Memo {
    private String date;
    private String memo;

    @Override
    public String toString() {
        return "Memo{" +
                "date='" + date + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memo memo1 = (Memo) o;
        return Objects.equals(date, memo1.date) && Objects.equals(memo, memo1.memo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, memo);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}

package db;

import java.util.Objects;

public class UserInfo {
    private String id;
    private String password;

    private String name;
    private int room_Number;

    public UserInfo(String id, String name, int room_Number) {
        this.id = id;
        this.name = name;
        this.room_Number = room_Number;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", room_Number=" + room_Number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return room_Number == userInfo.room_Number && Objects.equals(id, userInfo.id) && Objects.equals(password, userInfo.password) && Objects.equals(name, userInfo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, name, room_Number);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom_Number() {
        return room_Number;
    }

    public void setRoom_Number(int room_Number) {
        this.room_Number = room_Number;
    }
}
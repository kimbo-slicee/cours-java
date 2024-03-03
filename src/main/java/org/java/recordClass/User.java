package org.java.recordClass;

import java.util.Objects;
public class User {
    private String userName;
    private String userPhone;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public User(String userName, String userPhone) {
        this.userName = userName;
        this.userPhone = userPhone;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof User user)) return false;
        return Objects.equals(getUserName(), user.getUserName()) && Objects.equals(getUserPhone(), user.getUserPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getUserPhone());
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}

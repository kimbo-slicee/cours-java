package org.java.generics;

public class User {
   private String userName;
   private Integer userAge;
   private String userAdd;

    public User(String userName, Integer userAge, String userAdd) {
        this.userName = userName;
        this.userAge = userAge;
        this.userAdd = userAdd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserAdd() {
        return userAdd;
    }

    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userAdd='" + userAdd + '\'' +
                '}';
    }
}

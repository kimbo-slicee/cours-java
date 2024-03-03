package org.java.recordClass;

public class Main {
    public static void main(String[] args) {
    User user=new User("userName","0000");
        user.setUserName("setUsername");
        /*To string methode are generated outomaticaly in record classes */
        System.out.println(user.toString());



    }
}

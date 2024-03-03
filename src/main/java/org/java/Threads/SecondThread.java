package org.java.Threads;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        for (int i=0 ; i<5 ; i++)
            System.out.println("Your Age is"+ getUserAge(25));
    }
    public int getUserAge(int userAge){
        return userAge;
    }

}

package org.java.Threads;

public class FirstThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello 🤗");
        for (int i=0; i<5 ; i++)
            System.out.println("░░░"+getUsername("GOT 🐐")+"░░░");
    }
    public String getUsername(String userName){
        return userName;
    }


}

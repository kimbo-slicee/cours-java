package org.java.Threads;

public class Student extends Thread{
    public void run(){

        for (int i =0 ; i<10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {throw new RuntimeException(e);}
            System.out.println("You 🤪 ");
        }
    }

}

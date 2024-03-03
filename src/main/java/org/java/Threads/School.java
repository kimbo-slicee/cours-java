package org.java.Threads;

public class School extends Thread{

    public void run(){

        for (int i =0 ; i<10; i++){
            System.out.println("Me 😁");
            try {
                Thread.sleep(10);} catch (InterruptedException e) {
                throw new RuntimeException(e);}
        }


    }

}

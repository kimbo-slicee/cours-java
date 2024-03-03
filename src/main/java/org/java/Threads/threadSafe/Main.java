package org.java.Threads.threadSafe;

public class Main {
    public static void main(String[] args) {
        Counter counter=new Counter();
        /*The first thread calls the methode counter */
        Runnable runnable=()->{
        for (int i=0 ; i<100 ; i++){
            counter.increment();
        };


        };
        /*The second Thread calls the same methode the same time */
        Runnable runnable1=()->{
            for (int i =0; i<100 ; i++){
                counter.increment();
            };
        };
        /*Call the Threads */
        Thread thread1=new Thread(runnable);
        Thread thread=new Thread(runnable1);
        thread1.start();
        thread.start();
        try{
        thread1.join();
        thread.join();/*
                        Join 📎 method in Java ☕ allows one thread
                        to wait until another thread completes its execution.
                     */
        }catch (Exception e ){
            System.out.println("Thread Exception");
        }
        System.out.println(counter.counter);



    }
}

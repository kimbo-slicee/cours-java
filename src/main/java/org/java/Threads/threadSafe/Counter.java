package org.java.Threads.threadSafe;

public class Counter {
    public int counter=0;
     public synchronized int increment(){
          return counter++;
     }

}

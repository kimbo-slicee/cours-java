package org.java.Threads;

public class Main{
    public static void main(String[] args) {
        Student student=new Student();
        School school=new School();
        System.out.println(student.getPriority());
        /*[1]: First why to create threads */
        student.start();
        school.start();
        /*[2]: second why to create threds withe-Runnable Interface */
        Runnable firstThread=new FirstThread();
        Runnable secondThread=new SecondThread();
        Thread thread=new Thread(firstThread);
        Thread thread1=new Thread(secondThread);
        thread.start();
        thread1.start();
        /*[3]: Runnable Interface is a function interface, so we can use Lambda Expression */
        Runnable runnable=()->{
            System.out.println("I'm Thread From Functional InterFace 🌞");
        };
        Thread thread2=new Thread(runnable);
        thread2.start();



    }
}
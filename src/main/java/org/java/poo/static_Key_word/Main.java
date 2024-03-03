package org.java.poo.static_Key_word;

import java.util.UUID;

public class Main {
    static int x;
    static {
        /*we can decal-air variables in static block, but we cant access this variable outside the block*/
        String userName;
        /*
        Static Block work before the constructor and the
        principle mission of static block it s to initialize
        the static variables
         */
        x=10;
        System.out.println("hello from static block");
    }
    public static void main(String[] args) {

        /*the static key word in the main methode uses for Underused of memory bcs if we don't use static key word
        JVM will instance object form class main and that will consume a lot of memory  */
       Static_Key_Word student=new Static_Key_Word("student","123");
       Static_Key_Word student_1=new Static_Key_Word("student_1","200");
       Static_Key_Word student_2=new Static_Key_Word("student_2","400");
        System.out.println(student.toString());
        System.out.println(student_1.toString());
        System.out.println(student_2.toString());
        Static_Key_Word.seyHello(student);
        Static_Key_Word.seyHello(student_1);
        Static_Key_Word.seyHello(student_2);
        System.out.println(student_1.logIn(2,"200"));
        /*create object form inner class*/
        Static_Key_Word.InnerClass objectFromstaticInnerClass=new Static_Key_Word.InnerClass();
    }
}

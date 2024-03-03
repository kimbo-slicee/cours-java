package org.java.intro;

import org.w3c.dom.ls.LSOutput;

public class WrapperClasses {
    /*
     WrapperClasses needed to work with the Java Collection
      framework
      and its work with the boxing principe, and we have autoBoxing
    */
    Integer integer=10;
    int number=integer.intValue();//unboxing
    int getNumber=integer;//auto-unboxing

    public static void main(String[] args) {
        String num="100";
        int n=Integer.parseInt(num) ;
        System.out.println(n);
    }
}

package org.java.poo.methodes_Objects;

import java.awt.event.ContainerAdapter;
import java.util.Stack;

public class Main {
    /*
    there is a difference between complex data type and primitive data type
    when we send a primitive data type as argument, we send the value that s why
    the initial variable we Never change, but when we send the complex data type, we send the reference;
    */
    static void f(ComplexDataTypeClass x){
        ++x.number;
    }
    static int add(int n1 , int n2){
        int n3=n1+n2;
        return n3;
    }


    public static void main(String[] args) {
        ComplexDataTypeClass num=new ComplexDataTypeClass();
        num.number=1;
        f(num);
        System.out.println("the value of number num = " +num.number);
        System.out.println(add(1,1));
        Concat c1=new Concat();
        Concat c2=new Concat();
        c1.x=10;
        c2.x=10;
        Concat c4 = Concat.add(c1,c2);
        System.out.println(c4.x);
        /* assigned by value  */
        int num1=10;
        int num2=10;
        num1=num2;
        num1=20;
        System.out.println("hello = " + num2);
        /*assigned by reference*/
        ComplexDataTypeClass cdtc=new ComplexDataTypeClass();
        cdtc.number=10;
        ComplexDataTypeClass cdtc_1=new ComplexDataTypeClass();
        cdtc_1.number=1;
        cdtc=cdtc_1;
        cdtc.number=9;
        System.out.println(cdtc_1.number);

        /*How to Compare two Objects */


    }
}

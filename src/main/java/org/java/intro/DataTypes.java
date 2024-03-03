package org.java.intro;

public class DataTypes {
    int age =10;
    /*
     [1]:instance variables
     Error 🚨 Why 🤔 the instance variables cannot be reinitialized 🔄
     directly withing class 🗄
     [2]:Local Variables
         Declared 📢 inside methode or methode parameters
     [3]:Static Variables
            ---the static 🗿 variables are sheared between objects
            ------Declared one time in the memory
            ---------can be invoiced with the Name of Class
     */
    public static void localVariables(String userName , int userAge){
        System.out.println(userName + userAge);
    }

    /*
        Data Types in java: we have two Categories of Types in java Primitive and complex dataType
          [1]:Primitive
            ------> Integer [Byte,short,int,Long]
                 -----> Float [double,float]
                     -------> character ['A','B','c'....]
                          --------> Boolean [true , false]
        */
            byte n= 127;     /* 1 Byte Range:-128 to 127 */
            short n_1=901;  /*2 bytes*/
            int n_2=10;     /* 4 Bytes*/
            long n_3=100;   /*8 Bytes*/
            float marks=10.16f; /*   Bytes */
            double marks_2=19.26; /*8 Bytes sported by default in java */
            char c='a';/*2 Bytes java works with the UNICODE Note ASCII*/
            boolean b=true ; /*1 byte */

                /*Literal*/
                int number =0x75;
                int number_1 =10_00_00_00_0;
                double number_3=12e10;




}

package org.java.userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        int number=1;
        System.out.println("Enter number");
        try{
         number=System.in.read();/*IOException*/
        }catch(IOException e){
            System.out.println("you have Enter Value 1"+e);
        }
        System.out.println(number-48);/*But those not the best why to work with the input data*/
        /* BufferReader Class in the package 📂 java.io */
        try{
            /* Before scanner 👽 class in java */
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(in);
        int num=Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        }catch (Exception e){
            System.out.println("IO Exception");
        }


    }

}

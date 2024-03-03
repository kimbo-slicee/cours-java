package org.java.userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Resources {
    /* Resource is files or
    programs, and we need to close Resource after  */
    public static void main(String[] args) throws IOException {
        String text="";
        int number =100;
       String userName="Gogo";
       try{
           number=number/0;
       }catch (Exception e ){
           System.out.println(e);
       }finally {
        /* finally, block use to close resource */
           System.out.println("Close All resource");

       }
       try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))){
           System.out.println("entre une valuer ");
            number+=Integer.parseInt(bufferedReader.readLine());
           System.out.println(number);
       }
    }
}

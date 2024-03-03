package org.java.exception;
public class Throws {
    public static void f() throws HandelException{
        System.out.println("Handling First Exception ");
    }
    public void f2() throws HandelException {
        System.out.println(" Handling second Exception");
    }
    /*the first methode and the second methode handel the same exception Ducking*/
}

class HandelException extends Throwable {
    public void f3(){
            try{
               Throws.f();

            }catch (Exception | HandelException e){
                System.out.println("Hello user not found"); ;
            }
    }
}

package org.java.exception;

class NewExceptions extends Exception{
    public NewExceptions(String exceptionsName){
        super(exceptionsName);
    }
}
public class Main {
    public static void main(String[] args) {

    int i =1;
    int k= 10;
    String userName="userName";
    int[] numbers =new int[5];
        //System.out.println(i/i);/* this exception will stop the program execution.🛑 */
        try{
            System.out.println(userName.length());
            System.out.println(i);
            /*those note work bcs when we have the exception, the first ligne hi directly jumps out of the block  */
            System.out.println(numbers[6]);
        }
        catch (ArithmeticException e ){
            System.out.println("exception"+e );
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hello World");
        }catch (NullPointerException e ){
            System.out.println("NullPointerException");
        }
        /*Throw Key word*/
        try{
            throw new NewExceptions("userName it s so short");

        }catch (NewExceptions e){
            System.out.println(""+e);
        }
    }
}

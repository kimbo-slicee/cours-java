package org.java.intro;

import org.w3c.dom.ls.LSOutput;

public class Conditions {
   public String userName;
   public int x;
   public int y;
   Conditions(String userName){
       this.userName=userName;
   }

   public void setUserName(String userName){
       /*Condition Controller flow  */
       if(this.userName.equals(userName)) System.out.println("can you change ur userName plese");
       else if (this.userName.length()<0) System.out.println("not working");
       else System.out.println("hello World");
   }
   /*
        Ternary Operator in Java
        Syntax *---{ Boolean =condition ? true: false }---- *

        */

    /*
        Switch Statement in Java
        switch(n){
        case one :
            // Block of code
                break;
        case two:
            // Block of code
            break;
        case tree
            // block of code
            break;
         Default;
        }
        note:Before java 5 String was not supported in switch
        but after java 5 String supported
     */
    public void switchStatement(String day,String errorCode){
        String result="";
        /*Old version of switch */
    switch (day){
        case "Monday":
            System.out.println("Good Start mens Good end ");
            break;
        case "saturday","Sunday":
            System.out.println("go to Gym ");
            break;
        default:
            System.out.println("nice day ");
    }
    /*The new version of switch */
       result= switch (day){
            case"saturday":yield  "hello world ";
//            case "Monday"-> System.out.println("303030");
            case "Yield": yield "Good work";
           default : yield "nice";

        };
        System.out.println(result);
        /*
            Informational responses (100 – 199)
            Successful responses (200 – 299)
            Redirection messages (300 – 399)
            Client error responses (400 – 499)
            Server error responses (500 – 599)
        */
        String message =switch(errorCode){
            case "404":yield "Page note found";
            case "300":yield "Page note found ";
            case "200":yield "Good";

            default:yield "error not found";
        };
        System.out.println(message);

    }


}

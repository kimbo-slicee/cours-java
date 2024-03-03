package org.java.intro;

public class Loop {
    public static int number =1;
    public static void f(final boolean b){
        while (b){
            for (int x=0;x<=5;x++) System.out.println("x"+x);
            System.out.println(number);
            number++;
            if(number>=10 ) break;
        }
    }
    public static void f2(){
        int y=0;
        do{
            System.out.println("You are out side of the LOOP ⬅");
            y++;
            break;
        }while (y!=0);
    }
    /*[2] Enhanced for Loop in Java: ForEach*/
    public static String f(){
        String user="";
        String[] userNames={"user_1","user_2","user_3","user_4"};
        for(String userName: userNames ){
            System.out.println(userName);
            user=userName;
            return userName;
        }
        return user;
    }

    public static void main(String[] args) {
    Loop.f();
    }

}

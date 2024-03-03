package org.java.lambda;

public class Main {
    /* without Lambda Expression with the anonymous inner class*/
    Func func=new Func() {
        @Override
        public String seyHello(String userName){
            return "hello"+ userName;
        }

    };

    /*with lambda expression */
    Func func_2=(userName)->{
        return userName.equals("me")?"it s" + userName:"It s not me ";
    };



}

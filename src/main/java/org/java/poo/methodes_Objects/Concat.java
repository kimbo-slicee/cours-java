package org.java.poo.methodes_Objects;

public class Concat {
    public int x;
    public String userName;
    public int userAge;
    Concat(){

    }
    Concat(int x){
        this.x=x;
    }
    static Concat add(Concat c1,Concat c2){
//        Concat c3=c1+c2; 🚨 that s not working
        Concat c3=new Concat();
         c3.x= c1.x+c2.x;
         c3.userName=c3.userName+c2.userName;
         return c3;
    }
    Concat add(Concat c1){
        Concat c3=new Concat();
        c3.x=this.x+c1.x;
        return c3;
    }


}

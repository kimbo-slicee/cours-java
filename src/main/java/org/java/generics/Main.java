package org.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /** Instance an object form extended class */
    public static void main(String[] args) {
        Cat cat=new Cat("dog",20);
        PrintAnimal<Cat>catPrintAnimal=new PrintAnimal<>();
        catPrintAnimal.printAnimal(cat);
        List<Integer> inList=new ArrayList<>();

    }
    public static void questionMark(List<? extends Animals> users){
        for (Object user : users ){
            System.out.println(user);
        }
    }
}

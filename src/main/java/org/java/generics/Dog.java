package org.java.generics;

public class Dog extends Animals{
    public Dog(String animalName,int animalPath){
        super(animalName,animalPath);
    }
    private  <T> String shout(T type){
        return null;
    }
    private <T,E> T function(T type , E element ){
        if(type instanceof String) System.out.println("hello Mohammed");
        return type;
    }
    private static  <T,E> void getUserName(T type, E element){
        System.out.println("Hello : "+type+"element : " + element);
    }

    public static void main(String[] args) {
            Dog.getUserName(12,"kala");
            Dog.getUserName("mohammed","ele");
    }
}

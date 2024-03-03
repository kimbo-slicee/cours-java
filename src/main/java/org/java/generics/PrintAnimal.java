package org.java.generics;

public class PrintAnimal<T extends Animals>{
    T animal;
    public void printAnimal(T animal){
        System.out.println("Animals name is " + animal.animalName + "Animal path's is" + animal.animalPaths);
    };




}

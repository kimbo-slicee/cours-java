package org.java.generics;

public class GenericPrinter<T> {
    /*T can be any type */
    T thingTpPrint;
    public GenericPrinter(T thingTpPrint){
        this.thingTpPrint=thingTpPrint;
    }
    public void print(){
        System.out.println(thingTpPrint);
    }
}

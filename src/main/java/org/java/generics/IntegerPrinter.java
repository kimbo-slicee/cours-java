package org.java.generics;

public class IntegerPrinter {
    public Integer thingToPrint;

    public IntegerPrinter(int thingToPrint ){
        this.thingToPrint=thingToPrint;
    }
    public void print(){
        System.out.println(this.thingToPrint);
    }
}

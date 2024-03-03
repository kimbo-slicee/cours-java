package org.java.TypeConversion;

public class Main {
    public static void main(String[] args) {
        Employed employed= new  Developer();/*Upcasting */
        Developer developer =(Developer)employed;/*Downcasting ⬇ */
        employed.calcSalary();



    }
}

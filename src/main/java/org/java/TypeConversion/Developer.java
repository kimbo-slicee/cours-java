package org.java.TypeConversion;

public class Developer extends Employed{
    protected static final String DEPARTMENT="IT";
    protected double bonus;
    @Override
    public double calcSalary(){
        return this.salary +this.bonus;
    }
    public void f(){
        System.out.println("I'm developer ");
    }
}

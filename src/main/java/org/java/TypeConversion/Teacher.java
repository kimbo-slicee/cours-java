package org.java.TypeConversion;

public class Teacher extends Employed{
    protected double bonus;
    @Override
    public double calcSalary(){
        return this.salary +this.bonus;
    }
}

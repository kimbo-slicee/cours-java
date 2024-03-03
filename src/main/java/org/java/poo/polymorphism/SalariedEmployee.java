package org.java.poo.polymorphism;

public class SalariedEmployee extends Employee{
    float bouns ;
    public SalariedEmployee(float bouns) {
        this.bouns = bouns;
    }

    public SalariedEmployee(String name, String address, String department, String email, float salary, float bouns) {
        super(name, address, department, email, salary);
        this.bouns = bouns;
    }
  @Override/*Override it s not require, but we use it to help the compiler  */
  public float getSalary() {
      return super.getSalary() + bouns;
  }

 public void justForSalariedEmployee(){
     System.out.println("justForSalariedEmployee");
 }
        @Override
        public void print(){
        System.out.println("sub-class");
    }
}

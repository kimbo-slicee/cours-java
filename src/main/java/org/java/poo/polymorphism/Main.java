package org.java.poo.polymorphism;

import java.time.temporal.Temporal;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("mohammed",
                "maroc",
                "IT",
                "mohammed@gmail.com",
                200000
        );
        SalariedEmployee salariedEmployee=new SalariedEmployee(
                "salary",
                "maroc",
                "IT",
                "salary@gmail.com",
                200000,
                100
        );
        System.out.println(employee.getSalary());
        System.out.println(salariedEmployee.getSalary());
    employee=new SalariedEmployee(
            "salary",
            "maroc",
            "IT",
            "salary@gmail.com",
            200000,
            100
    );
    Employee salairdEmplyeed=new SalariedEmployee(
            "salaryName",
            "maroc",
            "IT",
            "salary@gmail.com",
            200000,
            200);

    salairdEmplyeed.print();

    }


}

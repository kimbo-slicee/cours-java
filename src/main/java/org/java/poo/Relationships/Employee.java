package org.java.poo.Relationships;

public class Employee {
    private int id ;
    private float salary;
    PersonalInfo personalInfo;

    public Employee(int id, float salary, PersonalInfo personalInfo) {
        this.id = id;
        this.salary = salary;
        this.personalInfo = personalInfo;
    }
}

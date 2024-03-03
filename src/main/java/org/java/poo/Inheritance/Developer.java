package org.java.poo.Inheritance;

public class Developer extends Employee{
    private String projectsName ;
    /*SubClass of employee Class
    if their s no constructor the subclass wille user the superClass constructor
    */
    public Developer(){
        System.out.println("sub class developer constructor");

    }
    public Developer(String userName,
                     String userAddress,
                     String phone,
                     String department,
                     String userEmail,
                     int yearOfBirthDay,
                     String projectsName
                     ){
//        super.phone="hello";
        super(userName,userAddress,phone,department,userEmail,yearOfBirthDay);//the call of the super must be the first called in the constructor
        this.projectsName=projectsName;
    }




}

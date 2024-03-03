package org.java.poo.Inheritance;

import org.java.poo.Relationships.Employee;

public class Main {
    public static void main(String[] args) {
        Developer developer=new Developer();
        Developer developer1=new Developer(
                "userName",
                "userAdders",
                "phone",
                "department",
                "userEmail",
                 10000,
                 "projectName"
                );
        Developer developer2=new Developer();
        System.out.println(developer2.toString());/* return the hashcode of the object withe hexadecimal*/
        System.out.println(developer2.hashCode());/* transform the hashcode to int number to help the JVM to find the object esy in the memory */
    }

}

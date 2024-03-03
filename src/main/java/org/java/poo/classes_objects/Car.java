package org.java.poo.classes_objects;

public class Car {
    /*
    *---------------------------------------"Access Level Modifier"------------------------------------------------------------------*
    Access modifiers in Java Object-Oriented Programming (OOP) are keywords that control the visibility and accessibility of classes,*
    fields (variables), methods, and constructors.They determine who can access these elements from other parts of your program,-----*
    promoting encapsulation and modularity.------------------------------------------------------------------------------------------*
    [
    Package-private[Default]📌:level of visibility Package ,
    public 🌍:we can access these properties in all the programme ,
    protected 🚨,
    private 🔐,
    ]
    */
    private String CarName="Dacia 🚗";
    private int maxSpeed=100;
    private String price= "20000DH";
    public int model=2020;
    /*getters[Mutators] ✍ and Setters[Accessors]*/
    public void setName(String carName){
        if(carName.length()>5)this.CarName=carName;
    }
    public String getCarName(){
        return this.CarName;
    }


    @Override
    public String toString(){

        return '{'+ "carName=" + this.CarName+ '}';
    }

}

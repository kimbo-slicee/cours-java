package org.java.poo;

import org.java.poo.classes_objects.Car;
import org.java.poo.classes_objects.Circle;

public class Main {
    public static void main(String[] args) {
        /*The Key Word new Reserve🚏space in memory for my Object */
        Car car_1 =new Car();
        /* Circle Exercise ⚪*/
        /*Instance One 1️⃣*/
        Circle circle=new Circle();
        circle.setRaduis(3.0);
        circle.setColor("#ffff");
        System.out.println(circle.getArea());
        /*Instance Two 2️⃣ */
        Circle circle1=new Circle();
        circle1.setRaduis(2.0);
        circle1.setColor("Blue");
        System.out.println(circle1.getCircumference() );
    }


}
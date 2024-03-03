package org.java.poo.classes_objects;

public class Circle {
    private double radius;
    private String color;
     public void setRaduis(double radius){
         this.radius=radius;
     }
     public void setColor(String color){
         this.color=color;
     }
     public double getRadius(){
         return this.radius;
     }
     public String getColor(){
         return this.color;
     }
      public double getArea(){
         return Math.PI * Math.pow(radius,2);
      }
      public double getCircumference(){
         return Math.PI*2*radius;
      }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

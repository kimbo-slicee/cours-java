package org.java.poo.constructor;

public class Main {
    public static void main(String[] args){
        Product product=new Product("product_1","new Product",10.5f,23,10),product1=new Product();
        System.out.println(product1.hashCode());
        System.out.println(product.hashCode());
        Product product2=new Product("product_1","new Product",10.5f,23,10,"black");
        /*Copy Constructor */
        Product product3=new Product(product2);
    }
}

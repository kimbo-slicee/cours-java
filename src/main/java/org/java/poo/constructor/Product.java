package org.java.poo.constructor;

import java.sql.Time;
import java.sql.Timestamp;

public class Product {
    private String productName;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;
    /*No arg constructor */
    public Product(){
        this.productName="there s no product";
        this.price=0.0f;
        this.quantity=0;
        this.discount=0;
        this.description="";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Product(String productName, String description,
                   float price, int quantity , float discount){
        this.productName=productName;
        this.description=description;
        this.price=price;
        this.quantity=quantity;
        this.discount=discount;
        System.out.println("hello from the first one ");
    }
    /*Constructor Chaining*/
    /* Finalizers vs Destructor*/
    public Product(String productName,
                   String description,
                   float price,
                   int quantity ,
                   float discount,
                   String color
    ){
        this(productName,description,price,quantity,discount);
        this.color=color;
        System.out.println("Hello from c two ™");

    }
    /*Copy Constructor*/
    public Product(Product product){
        this(product.productName,product.description,product.price,product.quantity,product.discount,product.color);

    }



}

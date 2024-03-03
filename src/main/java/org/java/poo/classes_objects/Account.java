package org.java.poo.classes_objects;

public class Account {
    private int accountNumber;
    private String userName;
    private float amount;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    public void insert(int accountNumber ,String userName, float amount ){
        this.accountNumber=accountNumber;
        this.userName=userName;
        this.amount=amount;
    }
    public  void deposit(float amount){
        this.amount+=amount;
    }
    public void withDraw(float amount){
        this.amount-=amount;
    }
}

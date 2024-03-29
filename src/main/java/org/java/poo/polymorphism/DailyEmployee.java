package org.java.poo.polymorphism;

public class DailyEmployee extends Employee{
    private float workDayPrice;
    private int dailyRate;

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public DailyEmployee(){
    }

    public DailyEmployee(String name, String address, String department, String email, float salary, float workDayPrice, int dailyRate) {
        super(name, address, department, email, salary);
        this.workDayPrice = workDayPrice;
        this.dailyRate = dailyRate;
    }



}

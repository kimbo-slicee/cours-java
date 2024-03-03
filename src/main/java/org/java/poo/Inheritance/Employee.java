package org.java.poo.Inheritance;

public class Employee {
    /*
    Access Modifier protected the
    subclasses and the classes in the same package
    symbol in class diagram # = protected
    */
    protected String userName;
    protected String userAddress;
    protected String phone;
    protected String department;
    protected String userEmail;
    public Employee(){
        /*Default*/
        System.out.println("Default constructor form Employee");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", department='" + department + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public Employee(String userName,
                    String userAddress,
                    String phone,
                    String department,
                    String userEmail,
                    int yearOfBirth
    ) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.phone = phone;
        this.department = department;
        this.userEmail = userEmail;
        this.yearOfBirth = yearOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }


    protected int yearOfBirth;
    public static void nice(){
        System.out.println("nice");
    }



}

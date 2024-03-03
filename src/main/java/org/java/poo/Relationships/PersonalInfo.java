package org.java.poo.Relationships;

public class PersonalInfo {
    private String firstName ;
    private String  middleName;
    private String lastName;
    private String  bloodGroup;
    private String accountNumber;
    private String nationality;
    private int yearOfBirth;
    public PersonalInfo(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public PersonalInfo(String firstName,
                        String middleName,
                        String lastName,
                        String bloodName,
                        String accountNumber,
                        String nationality,
                        int yearOfBirth
                        )
    {
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.accountNumber=accountNumber;
        this.bloodGroup=bloodName;
        this.nationality=nationality;
        this.yearOfBirth=yearOfBirth;
    }
}

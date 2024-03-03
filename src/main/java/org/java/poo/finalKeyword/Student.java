package org.java.poo.finalKeyword;

public class Student {
    final int STUDENT_ID;
    String studentName;
    int yearOfBirthDay;
    public final static int DEGREE_OF_SUCCESS;
    /*Final bock to initialize the value of final variables */
    static {
        DEGREE_OF_SUCCESS=10;
//        STUDENT_ID=1;
    }
    public Student(){
    STUDENT_ID=1;
    studentName=null;
    yearOfBirthDay=0;
    }
    public Student(final int STUDENT_ID,String studentName,int yearOfBirthDay){
    this.STUDENT_ID=STUDENT_ID;
    this.studentName=studentName;
    this.yearOfBirthDay=yearOfBirthDay;
    }
    public final void f(){
        System.out.println("final methode Confidential info 🔐");
    }

    public int getSTUDENT_ID() {
        return STUDENT_ID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getYearOfBirthDay() {
        return yearOfBirthDay;
    }

    public void setYearOfBirthDay(int yearOfBirthDay) {
        this.yearOfBirthDay = yearOfBirthDay;
    }
}

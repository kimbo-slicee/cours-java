package org.java.features.sealed;

sealed class Student permits ITStudent,AIStudent {
    private String studentName;
    private int studentAge;
    private String studentAdd;
    private int studentNumber;
    public Student() {}
    public Student(String studentName, int studentAge, String studentAdd, int studentNumber) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentAdd = studentAdd;
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentAdd() {
        return studentAdd;
    }

    public void setStudentAdd(String studentAdd) {
        this.studentAdd = studentAdd;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentAdd='" + studentAdd + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}

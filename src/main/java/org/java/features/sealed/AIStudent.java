package org.java.features.sealed;

non-sealed class AIStudent extends Student{
    private final String DEPARTEMENT="AI";

    public AIStudent() {
    }

    public AIStudent(String studentName, int studentAge, String studentAdd, int studentNumber) {
        super(studentName, studentAge, studentAdd, studentNumber);
    }

    public String getDEPARTEMENT() {
        return DEPARTEMENT;
    }
}

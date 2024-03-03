package org.java.features.sealed;

public final class ITStudent extends Student {
    private final String DEPARTEMENT="IT";

    public ITStudent() {
    }

    public ITStudent(String studentName, int studentAge, String studentAdd, int studentNumber) {
        super(studentName, studentAge, studentAdd, studentNumber);
    }
}

package org.java.poo.finalKeyword;

public class Main {
    /*Sometimes we do need to set limitation extensibility
    * for various reasons */
    public static void main(String[] args) {
        /*Final reference */
    final Student student=new Student(1,"studentName",2000);
            student.f();
            student.setStudentName("newStudentName");
        System.out.println(student.getStudentName());
    }
}

package org.java.method_Reference;

import java.util.Objects;

public class Person {
    private String name, personAdd,lastName;
    private Integer age;
    public Person(){

    }
    public Person(String name){

    }
    public Person(String name , String personAdd,String lastName , Integer age){
        this.name=name;
        this.personAdd=personAdd;
        this.lastName=lastName;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonAdd() {
        return personAdd;
    }

    public void setPersonAdd(String personAdd) {
        this.personAdd = personAdd;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personAdd='" + personAdd + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person person)) return false;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getPersonAdd(), person.getPersonAdd()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getAge(), person.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPersonAdd(), getLastName(), getAge());
    }
    public String f(Person person){
        return "I'm Static Methode form Person class Called by Methode reference and my Name is " + this.name   ;
    }
}

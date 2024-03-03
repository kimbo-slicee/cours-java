package org.java.collection;

import org.java.generics.GenericPrinter;
import org.java.generics.IntegerPrinter;
import org.java.generics.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        IntegerPrinter integerPrinter =new IntegerPrinter(25);
        integerPrinter.print();
        /*But what if we want print double or float, so we have created author functions with different params */
        /*Create, an object form Generic class */
        /*String does not acc*/
        GenericPrinter<Integer> genericPrinter=new GenericPrinter<>(250);
        GenericPrinter<Double> genericPrinter1=new GenericPrinter<>(20.0);
        genericPrinter.print();
        /*Array of users from DB */
        User user=new User("Hassan", 23, "Namik");
        ArrayList<User> users=new ArrayList<>();
        users.add(user);
        users.add(new User("NoMame",999,"Mike-Tyson"));





    }
}

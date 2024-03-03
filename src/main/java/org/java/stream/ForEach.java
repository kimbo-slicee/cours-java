package org.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    /**
     * [1]:forEch method is an async Methode Loop that accept Consumer parametre
     * [2]:Consumer is a @functionalInterface that has only one method named @Accept(T t)
     * and it s return void value
     */
    List<String> users = Arrays.asList("user_1","user_2","user_3","user_4");
    public void f(){
        Consumer<String> consumer= System.out::println;
        users.forEach(consumer);
    }
}

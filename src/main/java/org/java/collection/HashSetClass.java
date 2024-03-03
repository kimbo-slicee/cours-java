package org.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashSetClass {
    /*HashMap is an Implementation Map interface */

    public static void main(String[] args) {
    Map<String,Integer> userNameAndAge=new HashMap<>();
    userNameAndAge.put("userName",10);
    System.out.println("The size of Array HashMap is " + userNameAndAge.size());
        System.out.println(userNameAndAge.containsKey("userName"));
        System.out.println(userNameAndAge.getOrDefault("userName",25));
    }
}

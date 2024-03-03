package org.java.stream;
import java.util.*;
import java.util.function.Predicate;

public class Filter {
    /**
     [1]:Filter take parameter of type predicate
     [2]:predict is a Functional interface that includes one method named
      test(T t) and it s return a boolean value

     */

    public void getAllUsers(){
    Predicate<String> predicate=(String userName)-> userName.length() > 5 && userName.startsWith("A", 0);
    List<String> userNames= List.of("userOne","userTwo","userTree","userFour");
    userNames.stream().filter(predicate).forEach(System.out::println);/*Filter Tak */
    }


}

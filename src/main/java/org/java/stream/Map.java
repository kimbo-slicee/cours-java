package org.java.stream;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.event.spi.InitializeCollectionEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map {
    /*
    * Map Methode Accept a Parametre of type Function
    * A function parameter is implementation if Function<T, R> interface
    * that is a @FunctionalInterFace that in include apply(T t) methode
    * this methode return custom output of type R
    * */
    Function<Integer,Integer> function=new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer integer) {
          return integer+1;
        }
    };
    /*Lambda expression */
    Function<Integer,Integer> mapFunction=(i)->{
        return i+i;
    };
    public  void f(){
        List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,6,6,7,9);
        /*example One*/
        numbers.stream().map(function).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Map map=new Map();
        map.f();
    }
    /* Implement the second example 👊 */

}



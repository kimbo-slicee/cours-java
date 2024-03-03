package org.java.stream;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    /* Stream IPA Java 8 */
    public static void main(String[] args) {
        int sum=0;
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        for (int n:numbers){
            if(n%2==0){
                sum+=n*2;
                System.out.println(sum);
                ;/*Return even numbers */
            }
        }
        /* ForEach function How it s works ❓❓
         * ForEach tack an object of Consumer as parametre
         * Consumer is a function interFace that contain funct accept
         */
        List<Integer> numberList=Arrays.asList(1,2,3,4,5,5,6,5);
        Consumer<Integer>nums= n->System.out.println(n);/* === */numberList.forEach(nums);
        Stream<Integer>stream=numberList.stream();/* Create new Array */
        stream.forEach(System.out::println);/*IllegalStateException 🚨*/
        //stream.forEach(System.out::println);
        Integer integer= numberList.stream().filter(e->e%2==0).reduce(0,(c,e)->c+e);
        System.out.println(integer);






    }



}

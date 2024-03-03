package org.java.stream;

import java.util.Arrays;
import java.util.List;

public class Reduce{
    /**
     * the Reduce function take two parameters
     * the First parametre T of any type and the second parameter of type
     * BinaryOperator<T> InterFace that extends BiFunction<T,T,T> and BiFunction is {@FunctionalInterFace}
     * include Methode Named apply(T t, U u)
     * @param t the first function argument
     * @param u the second function
     */
    private <T,U> T apply(T t , U u ){
       return t;
    }
    public static void main(String[] args) {
//        List<Integer> numbers =new ArrayList<>();
            List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
            int total= nums.stream()
                    .filter(e->e%2==0)
                    .map(e-> e+e)
                    .reduce(0,Integer::sum);/*Method Reference*/
    }

}

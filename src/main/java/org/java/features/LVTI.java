package org.java.features;

import org.java.generics.Animals;

public class LVTI {
    /** LVTI:locale variables type inference
     * from java 8
     * in java 10 we can use local variables without specify the type just using var keyWord
     * Any fool can write code that a computer can understand.
     * Goode programs write code that humans Can understand {@MartinFowler}
     * */
    public static void main(String[] args) {
          var i=10; /* Var it s available only for local variables why ❓❔
                     * Bcs instance variables are creating for storage
                     * and local variables are creating for processing purpose
                     */
        //{var c}==>compile time error
        int[] numbers =new int[10];
        /*with the var syntax*/
        var nums=new int[10];
        var object=new Animals();
    }
}

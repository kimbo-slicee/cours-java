package org.java.intro;

public class StackAndHeap {
    /*[1]:Stack
    the stack memory stock variables as key and value
    In the JVM [last int-first out ]
    [2]:Heap
    -------------------------------------------------------------------------------------------------
    Local variables must be initialized before they can be used.
    Instance variable: These variables are declared within a class but outside any method,
    constructor, or block of code.They are associated with individual instances (objects) of the class.
    Each instance of the class has its own copy of the instance variables.
    --------------------------------------------------------------------------------------------------
    *  */
    public static int add(int n1 , int n2){
        return n1+n2 ;
    }
}

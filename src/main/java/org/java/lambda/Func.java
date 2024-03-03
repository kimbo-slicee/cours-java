package org.java.lambda;
@FunctionalInterface
public interface Func {
//    void show ();
    String seyHello(String userName);

    default void name(){
        System.out.println("wa Hassan ");
    }
}

package org.java.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunImmediately {
    String [] params() default "Me It s me 🤓 I swear God";
    double nums();
    int times();/*the type of this parameter should be a String or primitive data Type */
    /*we have to add a parenthesis, but this method works like a normal field*/
}

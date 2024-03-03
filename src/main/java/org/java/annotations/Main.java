package org.java.annotations;


import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class Main {
        public static  String  result;
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        @SuppressWarnings("unused")
        Cat cat =new Cat("Hello Gys Im Tome 😺 and I m looking for Jerry 🐭 ");
        /*Check for Annotation exists */
        if(cat.getClass().isAnnotationPresent(VeryImportant.class)) System.out.println("This Class or methode is very important 🚧 ⚠");
        else System.out.println("that's not very important ✖");
        /*Check for Annotation methods */
        for(Method method: cat.getClass().getDeclaredMethods()){
           if(method.isAnnotationPresent(RunImmediately.class)){
               /*get Annotation params */
               RunImmediately runImmediately = method.getAnnotation(RunImmediately.class);
               for (int i=0 ; i<runImmediately.times() ; i++) method.invoke(cat);
           }else {
               System.out.println("methode Note Found ❌");
           }
        }
    /*create some logical function to testing the cate fileds */
        /*
         [1]:Loop in All fields
         [2]:Check if fields have the Annotation specified
         [3]:
         */
        for(Field field : cat.getClass().getFields()){
            if(field.isAnnotationPresent(FieldAnnotation.class)){
                 Object object=field.get(cat);/*get return Object */
                if(object instanceof String fieldValue){
                    System.out.println(fieldValue.toUpperCase(Locale.ROOT));
                } else if (object instanceof Integer fieldValue) {
                    System.out.println(fieldValue+Math.pow(2,2));
                }else System.out.println("there is no field Annotations ");
            }
        }

    }



}


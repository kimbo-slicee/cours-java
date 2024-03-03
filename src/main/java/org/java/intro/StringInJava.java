package org.java.intro;

public class StringInJava {
    public static String userAdd="Static";
    public final String userSchool="School";
        /*
        [1]:Mutable [can change] vs. Immutable[unchanged] String in Java
        ich one of the Strings that create in the java are created as a 21 constante
        and located in String constant pool 🏊‍♂️;
        [2]:StringBuffer and StringBuilder in Java
          ----StringBuffer is Mutable, and we can change it and it s give you a Buffer size de 16 Byte but the size can change
            --------StringBuffer vs StringBeguiler
                    StringBuffer is thread Safe but String builder Note

        * */




    public static void main(String[] args) {
    String userName=new String("userName");
        String s="userName";
        if (userName.equals(s)) System.out.println("String constant bool");/*so what's happened her is that when */
        StringBuffer stringBuffer =new StringBuffer();
        System.out.println(stringBuffer.capacity());
        StringBuffer se=new StringBuffer("newCapacities");
        System.out.println(se.delete(0,1));
        System.out.println(se);
        System.out.println(se.insert(se.length(),"Mohammed"));
        se.setLength(se.length()+10);
        System.out.println(se.capacity());
        StringBuilder stringBuilder=new StringBuilder("thread not Safe");

    }

}

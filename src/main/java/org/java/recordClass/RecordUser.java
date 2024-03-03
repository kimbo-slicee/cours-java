package org.java.recordClass;
record RecordUser (String userName, String userPhone,String userAdd) {
    /*Record class can have only static instance variables */
    static int FoodName;
    /**
     * Canonical constructor:
     * By default, in record class, there's a parametrized constructor.
     * But if we want to check on the arguments, we need to redefine our constructor,
     * and that's called canonical Constructor
     * Compact Canonical constructor:
     * this type of constructor in record allows us to create conditions and the
     * program binned the say create fields
     * you can write just the condition wthout need to
     * */
    RecordUser{if (userAdd.equals("Morocco")) System.out.println("I'm From Morocco 🌟");}

    /** Java recorde classes are a specific type of data classes
     *One of the most common complaints about Java is that you need to write
     * a lot of code for a class to be useful. Quite often you need to write the following:
     * toString()
     * hashCode() and equals()
     * Getter methods
     * A public constructor
     * the fields in Record classes are declared as final, so we can't change it after instantiation,
     * and there's no set Methode
     * Record class cannot extend another class. But record class can extend record class and Record classes can implement interfaces
     */
   public static void f(){
       System.out.println("Hello Im Record class 📀");
    }
}

package org.java.poo.static_Key_word;
public class Static_Key_Word {

/* we will create a Student management system to implement Static Key word */
    static int count =1;
    private int number;
    private String studentName;
    private String password;
    static String college="IT";
    boolean result;
    private int userAge;
    private static int passwordLenght=6;
    public Static_Key_Word(){
        System.out.println("hello form construct");

    }
   public Static_Key_Word(String studentName,String password){
       this.password=password;
       this.number=count;
       this.studentName=studentName;
       count++;


    }

    /*Static methode say hello new student */
    private static void checkPassword(String password){
        /* the static methode do not accept this and super and non-static variables */
        Static_Key_Word userAge=new Static_Key_Word();
        System.out.println(userAge.userAge);
        if(password.length()<passwordLenght) System.out.println("week password");
        else System.out.println("good password");
    }
    public Boolean logIn(int number, String password){
        result = this.number == number && this.password.equals(password);
        return result;
    }
    public static void seyHello(Static_Key_Word student){
        String hello="hello"+student.studentName;
        System.out.println(hello);
    }
    /*we can use the static key classes ??
    the answer is yes, but as subClass or inner class*/
    public static class InnerClass{
        /*we can instance an object from inner static class?? yes, we can */
        int x=10;
        static int y=10;
         static {
             System.out.println("hello from static class");
             y+=20;
        }
        public void methodeFromStaticClass(){
            System.out.println(passwordLenght);
        }
    }

    @Override
    public String toString() {
        return "Static_Key_Word{" +
                "number=" + number +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}

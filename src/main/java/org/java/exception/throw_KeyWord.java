package org.java.exception;

public class throw_KeyWord {
    private String userName;
    public static String f(String userName){
        return "find user by "+userName;
    }
    public static void main(String[] args) {
        getUsers();
    }
    public static void getUsers(){
        /*fetch data from data Base*/
        try{
            f("userName");
            throw new NewExceptions("user Not found Exception");
        }catch (NewExceptions e){
            System.out.println(e);
        }

    }


}

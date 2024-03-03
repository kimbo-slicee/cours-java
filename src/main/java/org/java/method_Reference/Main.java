package org.java.method_Reference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /*Syntax-class::Method*/
    public static void main(String[] args) {
        Person a =new Person("personOne","Agadir","UIR",20);
        Person b =new Person("personTwo","Agadir","UIR",21);
        Person c =new Person("personTree","Agadir","UIR",22);
        Person d =new Person("personFour","Agadir","UIR",24);
        List<Person> personList= Arrays.asList(a,b,c,d);
        personList.stream().filter(e->e.getAge()>21).forEach(System.out::println);
        personList.stream().map(Person::getPersonAdd).forEach(System.out::println);
        /*Methode Reference also can be used to Call awr contracture*/
        /* [1]:Withe lambda expression */
        List<String> userNames= List.of("Zan","Zan","Zin","Zin");
        List<Person> newUserList=userNames.stream().map(e->new Person(e)).toList();
        /*[2]:withe Methode Reference */
        List<Person> newUserList_2=userNames.stream().map(Person::new).toList();
        personList.forEach(a::f);/*Methode Referance Called By  Instance */
        var s = """
                Hello now we i can talk withe you;
                and that's just in java 21;
                """;


    }
}

package hometasks.Chapter14.task7;

/**
 * Created by Admin on 12.03.2016.
 */

import java.util.*;


public class GenericMethod {
    public static <T> List<T> method(){
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<String> k  = method();
        k.add("a");
        k.add("b");
        k.add("c");
        k.add("d");

        System.out.println(k);
    }
}

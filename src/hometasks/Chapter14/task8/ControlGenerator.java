package hometasks.Chapter14.task8;

/**
 * Created by Admin on 12.03.2016.
 */


import hometasks.Chapter14.task8.coffee.*;

import java.util.ArrayList;
import java.util.Collection;

public class ControlGenerator {
    public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }




    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee cof : coffee){
            System.out.println(cof);
        }
    }

}

package hometasks.Chapter11.task13;

import java.util.Collection;
import java.util.*;

/**
 * Created by Admin on 26.02.2016.
 */

public class CollectionSequence {
    Collection<String> collection = new LinkedList<>();

}
class Iter{
    public void display(Collection<String> c){
        for (String k : c){
            System.out.println(k);
        }
    }
}

class Main{
    public static void main(String[] args) {
        new Iter().display(new CollectionSequence().collection);
    }
}


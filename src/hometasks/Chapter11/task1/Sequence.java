package hometasks.Chapter11.task1;

/**
 * Created by Admin on 07.02.2016.
 */
import java.util.*;

public class Sequence {
    private Collection<Object> items;
    private int next = 0;
    public Sequence(){ items = new  ArrayList<>(); }
    public void add(Object x){
        items.add(x);
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 20; i++) {
            sequence.add(Integer.toString(i));
        }
    }
}


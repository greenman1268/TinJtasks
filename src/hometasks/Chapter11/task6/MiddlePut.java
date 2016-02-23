package hometasks.Chapter11.task6;

/**
 * Created by Admin on 23.02.2016.
 */
import java.util.*;
public class MiddlePut {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> li = list.listIterator();
        for (int i = 0; i < 10; i++) {
           if(list.size()<2)li.add(i);
            else {
               li = list.listIterator(list.size()/2);
               li.add(i);
           }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

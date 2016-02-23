package hometasks.Chapter11.task5;

/**
 * Created by Admin on 23.02.2016.
 */


import java.awt.*;
import java.util.*;
import java.util.List;

public class ListIter {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList(list1.size());
        ListIterator<Integer> listiter = list1.listIterator(list1.size());

        while (listiter.hasPrevious()){
           // System.out.println(listiter.previous());
            list2.add(listiter.previous());
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}

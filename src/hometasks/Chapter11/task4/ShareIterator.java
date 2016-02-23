package hometasks.Chapter11.task4;

/**
 * Created by Admin on 23.02.2016.
 */
import java.util.*;
public class ShareIterator {
    public static void megaIterator(Collection c){
        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Collection<Integer> in = new ArrayList(Arrays.asList(new Integer[]{1,2,3,4,5}));
        Collection<Double> dou = new ArrayList(Arrays.asList(new Double[]{1.2,2.5,3.4,4.7,5.6}));
        Collection<Character> cha = new ArrayList(Arrays.asList(new Character[]{'b','l','a','v','c'}));
        megaIterator(in);
        megaIterator(dou);
        megaIterator(cha);
    }
}

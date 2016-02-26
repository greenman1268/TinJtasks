package hometasks.Chapter11.task12;

/**
 * Created by Admin on 26.02.2016.
 */
import java.util.*;

public class PqWithMnog extends Object{
    }

class Main {
    public static void main(String[] args) {
        Set<PqWithMnog> set = new HashSet<>();
        set.add(new PqWithMnog());
        set.add(new PqWithMnog());
        set.add(new PqWithMnog());
        set.add(new PqWithMnog());
        PriorityQueue<Set<PqWithMnog>> pq = new PriorityQueue<>();
        pq.offer(set);
    }
}

package hometasks.Chapter11.task11;

/**
 * Created by Admin on 26.02.2016.
 */
import java.util.*;

public class PrQueue {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 100; i++) {
            priorityQueue.offer(random.nextDouble());
        }
        for (int i = 0; i < priorityQueue.size(); i++) {
            System.out.println(priorityQueue.poll());
        }

    }
}

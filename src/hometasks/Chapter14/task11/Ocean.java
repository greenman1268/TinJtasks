package hometasks.Chapter14.task11;

import java.util.*;
import java.util.Random;
/**
 * Created by Admin on 14.03.2016.
 */
public class Ocean {
    public static void eat(BigFish bf, LittleFish lf){
        System.out.println(bf + " has ate " + lf);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<BigFish> bf = new LinkedList<>();
        Generators.fill(bf, BigFish.generator(), 15);
        List<LittleFish> lf = new ArrayList();
        Generators.fill(lf, LittleFish.generator, 15);
        for (BigFish b : bf){
            eat(b,lf.get(random.nextInt(lf.size())));
        }

    }
}

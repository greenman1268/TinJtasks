package hometasks.Chapter14.task11;

/**
 * Created by Admin on 14.03.2016.
 */
public class BigFish {
    private static long counter = 1;
    private final long id = counter++;
    public String toString(){return "BigFish" + id;}
    private BigFish(){}
    public static Generator<BigFish> generator(){
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };}
     }


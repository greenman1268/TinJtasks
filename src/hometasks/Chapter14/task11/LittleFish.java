package hometasks.Chapter14.task11;

/**
 * Created by Admin on 14.03.2016.
 */
public class LittleFish {
    private static long counter = 1;
    private final long id = counter++;
    public String toString(){return "LittleFish" + id;}
    private LittleFish(){}
    public static Generator<LittleFish> generator = () -> new LittleFish();

}

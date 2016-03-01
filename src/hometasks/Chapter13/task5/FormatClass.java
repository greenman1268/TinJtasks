package hometasks.Chapter13.task5;

/**
 * Created by Grisha on 01.03.2016.
 */
public class FormatClass {
    int i = 5;
    long l = 300000000;
    float f = 156.12345f;
    double d = 431.431431431;

    public String toString(){
        return String.format("%d %d %.2f %.5e",i,l,f,d);
    }

    public static void main(String[] args) {
        System.out.println(new FormatClass());
    }
}

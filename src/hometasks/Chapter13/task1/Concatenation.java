package hometasks.Chapter13.task1;

/**
 * Created by Admin on 01.03.2016.
 */
//414
import java.util.*;
public class Concatenation {
    @Override
    public String toString() {
        return "Concatenation{} "+super.toString()+"\n";
    }

    public static void main(String[] args) {
        List<Concatenation> list = new ArrayList<Concatenation>();
        for (int i = 0; i < 10; i++) {
            list.add(new Concatenation());
        }
        System.out.println(list);
    }
}

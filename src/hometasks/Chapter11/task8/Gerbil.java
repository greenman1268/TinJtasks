package hometasks.Chapter11.task8;

import com.sun.javafx.collections.MappingChange;

/**
 * Created by Admin on 23.02.2016.
 */
import java.util.*;
public class Gerbil {
    static int gerbilnumber;
    int k;
    public Gerbil(){
        ++gerbilnumber;
        k=gerbilnumber;}

    @Override
    public String toString() {
        return "gerbilnumber=" + this.k + '}';
    }
}
class PullMap{
    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<>();
        map.put("First",new Gerbil());
        map.put("Second",new Gerbil());
        map.put("Third",new Gerbil());
        map.put("Fourth",new Gerbil());
        map.put("Fifth",new Gerbil());

        Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            System.out.println(key+" "+map.get(key));
        }
    }
}

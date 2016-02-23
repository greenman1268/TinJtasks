package hometasks.Chapter11.task3;

/**
 * Created by Admin on 23.02.2016.
 */
import java.util.*;
public class Gerbil {
   static int gerbilnumber;
    int k;
    public Gerbil(){
        ++gerbilnumber;
        k=gerbilnumber;
    }

    @Override
    public String toString() {
        return "gerbilnumber=" + this.k + '}';
    }
}
class test{
    public static void main(String[] args) {
        ArrayList<Gerbil> p;
        Gerbil[] g = new Gerbil[10];
        for (int i = 0; i < g.length; i++) {
            g[i] = new Gerbil();
        }
        p = new ArrayList(Arrays.asList(g));
        System.out.println("ITERATOR");
        Iterator<Gerbil> iter = p.iterator();
        while (iter.hasNext()){
            Gerbil d = iter.next();
            System.out.println(d);
        }
        System.out.println("FOREACH");
        for (Gerbil d:p){
            System.out.println(d);
        }

    }
}

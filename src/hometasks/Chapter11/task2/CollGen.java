package hometasks.Chapter11.task2;

/**
 * Created by Admin on 12.02.2016.
 */
import java.util.*;

public class CollGen {
    String[] list = {
            "character1",
            "character2",
            "character3",
            "character4",
            "character5",
            "character2",
    };
    ArrayList<String> arrayList = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<>();
    HashSet<String> hashSet = new HashSet<>();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    TreeSet<String> treeSet = new TreeSet<>();

    public void next(){
        for (int i=0; i<list.length; i++) {
            System.out.println(list[i]);
            arrayList.add(list[i]);
            linkedList.add(list[i]);
            hashSet.add(list[i]);
            linkedHashSet.add(list[i]);
            treeSet.add(list[i]);
        }
    }

    public void showAll(Collection<String> coll){
        System.out.println(coll.getClass().getSimpleName());
        for (String s : coll) System.out.println(s);

    }

    public static void main(String[] args) {
        CollGen cg = new CollGen();
        System.out.println("next");
        cg.next();
        System.out.println();
        System.out.println("show all");
        cg.showAll(cg.arrayList);
        cg.showAll(cg.linkedList);
        cg.showAll(cg.linkedHashSet);
        cg.showAll(cg.treeSet);
        cg.showAll(cg.hashSet);
    }
}

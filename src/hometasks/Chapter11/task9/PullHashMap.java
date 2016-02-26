package hometasks.Chapter11.task9;

/**
 * Created by Admin on 23.02.2016.
 */


import java.util.*;



public class PullHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Random rand = new Random(50);
        for (int i = 0; i < 30; i++) {
            int k = rand.nextInt(50);
            map.put(Integer.toString(k),"it's "+k);
        }

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.putAll(map);
        for (Map.Entry<String,String> mapa : map.entrySet()){
            System.out.println(mapa.getKey()+" "+mapa.getValue());}

    }
}

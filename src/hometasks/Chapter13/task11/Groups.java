package hometasks.Chapter13.task11;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

/**
 * Created by Admin on 02.03.2016.
 */
//438

public class Groups {
   private static Map<String,Integer> counter = new HashMap<>();
    static public final String str =
                    "Twas brilling, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths All outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws  Jubjub that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public void bookPatcher(){
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(str);
        while (m.find()){
            for (int j = 0; j <= m.groupCount(); j++) {
                System.out.println("[" + m.group(j) + "]");
            }
        }
    }
    public static void taskPatcher(){
        String[] split = str.replaceAll("\\b[a-z]+[,.\\s\\n][\\s\\n]?","").split(" ");
       // System.out.println(split);
     for (int i = 0; i < split.length; i++) {
           // replace[i]=replace[i].trim();
            System.out.println("["+split[i]+"]");
        }

        for (int i = 0; i < split.length; i++) {
            if(counter.containsKey(split[i])){int k = counter.get(split[i]);counter.replace(split[i],k+1);}
            else counter.put(split[i],1);
        }
        System.out.println("----IN COUNTER----");

        for (Map.Entry<String,Integer> map : counter.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }

    }

    public static void main(String[] args) {
            taskPatcher();
    }
}

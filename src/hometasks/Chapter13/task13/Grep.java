package hometasks.Chapter13.task13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Grisha on 02.03.2016.
 */
//446
public class Grep {
    static public final String str =
            "Twas brilling, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths All outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws  Jubjub that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b[ABtms]\\w+",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        int index = 0;
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }
}

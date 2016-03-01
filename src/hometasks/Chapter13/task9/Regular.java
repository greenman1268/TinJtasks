package hometasks.Chapter13.task9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Grisha on 01.03.2016.
 */
public class Regular {
    public static void main(String[] args) {
        String[] regex = {"^Java","\\Breg.*","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}.","s{0,3}"};
        String sentence = "Java now has regular expressions";
        Pattern p;
        Matcher m;
        for (int i = 0; i < args.length; i++) {
            p = Pattern.compile(args[i]);
            m = p.matcher(sentence);
            while (m.find()){
                System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end()-1));
            }
         }

    }
}

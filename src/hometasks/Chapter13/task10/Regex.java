package hometasks.Chapter13.task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Grisha on 01.03.2016.
 */
public class Regex {
    public static void main(String[] args) {
        //System.out.println(Pattern.matches("(\\?i)((\\^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b","Arline ate eight apples and one orange while Anita hadn't any"));
      //  System.out.println("Arline ate eight apples and one orange while Anita hadn't any".matches("(\\?i)((\\^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b"));
        Pattern p = Pattern.compile("(\\?i)((\\^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher("Arline ate eight apples and one orange while Anita hadn't any");
        while (m.find()){
            System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end()-1));
        }
    }
}

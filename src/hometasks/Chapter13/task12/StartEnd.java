package hometasks.Chapter13.task12;

/**
 * Created by Admin on 02.03.2016.
 */
//440
import java.util.regex.*;

public class StartEnd {
    public static String input =
          /*  "Twas brilling, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths All outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws  Jubjub that catch.\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumious Bandersnatch.\n" +*/
            "Never give up! Never surrender!";

    private static class Display{
        private boolean regexPrinted = false;
        private String regex;
        Display(String regex){this.regex = regex;}
        void display(String message){
            if(!regexPrinted){
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }
    static void examine(String s, String regex){
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) d.display("find() '" + m.group() + "' start = " + m.start() + " end = " + m.end());
            if(m.lookingAt()) d.display("lookingAt() '" + m.group() + "' start = " + m.start() + " end = " + m.end());
            if(m.matches()) d.display("matches() '" + m.group() + "' start = " + m.start() + " end = " + m.end());

    }

    public static void main(String[] args) {
        for (String in : input.split("\n")){
            System.out.println("input: " + in);
            for (String regex : new String[]{"\\w*ere\\w*","\\w*ever","T\\w+","Never.*?!","\\w*lling\\w*"})
           // examine(in,"(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$");
            examine(in,regex);
        }
    }
}


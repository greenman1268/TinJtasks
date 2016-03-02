package hometasks.Chapter13.task14;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Grisha on 02.03.2016.
 */
//446
public class JGrep {
    public static void main(String[] args) {
        File[] files = new File(args[0]).listFiles();
        for (int i = 0; i < files.length; i++) {
           // System.out.println(files[i]);
            Matcher m = Pattern.compile(args[1]).matcher(files[i].toString());
            while (m.find())System.out.println(m.group());
        }
        /*
        Pattern p = Pattern.compile("\\b[ABtms]\\w+",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        int index = 0;
        Matcher m = p.matcher("");
        while (m.find()){
            System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }*/
    }
}

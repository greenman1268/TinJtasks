package hometasks.Chapter13.task17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Grisha on 02.03.2016.
 */
//446
public class MegaJGrep {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        ArrayList<String> list = new ArrayList<>();
        Matcher m = Pattern.compile("(import .*)(.\\w+;)").matcher("");
        while (reader.ready()){
            m.reset(reader.readLine());
            while (m.find()) System.out.println(m.group());
        }
    }
}

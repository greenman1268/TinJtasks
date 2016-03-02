package hometasks.Chapter13.task15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Grisha on 02.03.2016.
 */
//446
//IT's comment
public class JGrep {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        Matcher m = Pattern.compile("[//[/**]](.*)[*/]?",Pattern.DOTALL).matcher("");
        while (reader.ready()){
            m.reset(reader.readLine());
            while (m.find()) System.out.println(m.group());
        }

    }
}

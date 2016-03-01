package hometasks.Chapter12.task15;

import java.io.FileInputStream;

/**
 * Created by Admin on 01.03.2016.
 */
//410
public class IO {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream("IO.java");
        while (inputStream.available()>-1){
            System.out.println(inputStream.read());
        };

    }
}

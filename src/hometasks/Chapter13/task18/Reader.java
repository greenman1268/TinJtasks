package hometasks.Chapter13.task18;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

/**
 * Created by Grisha on 02.03.2016.
 */
//448

public class Reader {
    /*int i;
    long l;
    double d;
    String s;*/

    public Reader(String ss) {
        Scanner scanner = new Scanner(new BufferedReader(new StringReader(ss)));
        System.out.println("String "+scanner.nextLine());
        System.out.println("Int "+scanner.nextInt());
        System.out.println("Long "+scanner.nextLong());
        if(scanner.hasNextDouble())System.out.println("Double "+scanner.nextDouble());
    }

    public static void main(String[] args) {
        Reader reader = new Reader("Sir Robin of Camelot\n 23 300000000000000       \n3.67456");
    }
}

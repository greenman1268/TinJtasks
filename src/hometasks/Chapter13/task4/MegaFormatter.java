package hometasks.Chapter13.task4;

import java.util.Formatter;

/**
 * Created by Grisha on 01.03.2016.
 */
public class MegaFormatter {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        f.format("%-4d \n%c \n%-2b \n%20s \n%-10.5f \n%-3e \n%x \n%-8h ",102,150,5<4,new Object(),(float)Float.MAX_EXPONENT,2.4*100000,0xFFF,47);
        f.format("%02X: ",32);
    }
}

package hometasks.Chapter13.task24.control.factories;

import hometasks.Chapter13.task24.control.TypeCounter;

/**
 * Created by Admin on 04.03.2016.
 */
public class FactoryCounter {
    public static void main(String[] args) {
        TypeCounter typeCounter = new TypeCounter(Part.class);
        Part part = new Part();

       for (int i = 0; i < 10; i++) {
           part = Part.createRandom();
            typeCounter.count(part);
             }
        System.out.println();
        System.out.println(typeCounter);
    }
}

package hometasks.Chapter13.task24.control.coffee;

import hometasks.Chapter13.task24.control.TypeCounter;

/**
 * Created by Admin on 04.03.2016.
 */
public class CoffeCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        for(Coffee c : new CoffeeGenerator(10)){
            counter.count(c);
        }
        System.out.println();
        System.out.println(counter);
    }
    }

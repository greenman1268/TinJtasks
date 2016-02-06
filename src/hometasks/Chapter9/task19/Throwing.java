package hometasks.Chapter9.task19;

/**
 * Created by Admin on 06.02.2016.
 */

import java.util.*;

public class Throwing {
    public static void st(ToThrowFactory factory){
        ToThrow t = factory.getToThrow();
        t.makeThrow();
    }
    public static void main(String[] args) {
        st(new CoinFactory());
        st(new CubeFactory());
    }
}

interface ToThrow {
    void makeThrow();
}

interface ToThrowFactory {
    ToThrow getToThrow();
}

class Coin implements ToThrow {
    Random random = new Random(4);

    @Override
    public void makeThrow() {
        for (int i = 0; i < 5; i++) {
            int k = random.nextInt(3) + 1;
            if (k == 1) System.out.println("heads");
            else if (k == 2) System.out.println("tails");
        }
    }
}

class CoinFactory implements ToThrowFactory {

    @Override
    public ToThrow getToThrow() {
        return new Coin();
    }
}

class Cube implements ToThrow{
    Random random = new Random(50);
    @Override
    public void makeThrow() {
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(7)+1+" side");
        }
    }
}

class CubeFactory implements ToThrowFactory{

    @Override
    public ToThrow getToThrow() {
        return new Cube();
    }
}

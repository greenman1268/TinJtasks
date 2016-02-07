package hometasks.Chapter10.task16;

/**
 * Created by Admin on 06.02.2016.
 */

import java.util.Random;

public class Throwing {
    public static void st(ToThrowFactory factory){
        ToThrow t = factory.getToThrow();
        t.makeThrow();
    }
    public static void main(String[] args) {
        st(new CoinFactory().toThrowFactory());
        st(new CubeFactory().toThrowFactory());
    }
}

interface ToThrow {
    void makeThrow();
}

interface ToThrowFactory {
    ToThrow getToThrow();
}

class Coin {
    ToThrow toThrow(){
        return new ToThrow() {
            @Override
            public void makeThrow() {
                Random random = new Random(4);
                for (int i = 0; i < 5; i++) {
                    int k = random.nextInt(3) + 1;
                    if (k == 1) System.out.println("heads");
                    else if (k == 2) System.out.println("tails");
                     }
                 }
            };
        }
    }


class CoinFactory  {
    ToThrowFactory toThrowFactory(){
        return new ToThrowFactory() {
            @Override
            public ToThrow getToThrow() {
                return new Coin().toThrow();
            }
        };
    }
}

class Cube  {
    ToThrow toThrow(){
        return new ToThrow() {
            @Override
            public void makeThrow() {
                Random random = new Random(50);
                for (int i = 0; i < 10; i++) {
                    System.out.println(random.nextInt(7)+1+" side");
                }
            }
        };
    }
}

class CubeFactory {
    ToThrowFactory toThrowFactory(){
        return new ToThrowFactory() {
            @Override
            public ToThrow getToThrow() {
                return new Cube().toThrow();
            }
        };
    }
}

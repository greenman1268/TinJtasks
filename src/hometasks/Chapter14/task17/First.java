package hometasks.Chapter14.task17;

/**
 * Created by Admin on 16.03.2016.
 */

public interface First {
    void firstin();
}

interface Second {
    void secondin();
}

class Realize<C extends First & Second> {
    static <A extends First> void method1(){
        System.out.println(" from Realize.method1()");
    }
    static <B extends Second> void method2(){
        System.out.println(" from Realize.method2()");
    }

    public static void main(String[] args) {
        Realize r = new Realize();
       r.method1();
       r.method2();
    }
}


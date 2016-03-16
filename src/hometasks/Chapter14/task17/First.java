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

class Realize<C extends First & Second> implements First,Second{
     <A extends First> void method1(C c){
        System.out.println(" from Realize.method1()");
    }
     <B extends Second> void method2(C c){
        System.out.println(" from Realize.method2()");
    }

    public static void main(String[] args) {
        Realize r = new Realize();
       r.method1(new Realize<>());
       r.method2(new Realize<>());
    }

    @Override
    public void firstin() {
        System.out.println("from Realize.firstin()");
    }

    @Override
    public void secondin() {
        System.out.println("from Realize.secondin()");
    }
}


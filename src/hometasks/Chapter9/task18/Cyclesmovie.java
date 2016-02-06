package hometasks.Chapter9.task18;

/**
 * Created by Admin on 06.02.2016.
 */

public class Cyclesmovie {
    public static void make(CycleFactory c){
        Cycle s = c.getCycle();
        s.doSomth();
    }
    public static void main(String[] args) {
        make(new UnicycleFactory());
    }
}

interface Cycle{
    void doSomth();
}
interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{

    @Override
    public void doSomth() {
        System.out.println("I am Unycicle");
    }
}

class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
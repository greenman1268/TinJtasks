package hometasks.Chapter10.task21;

/**
 * Created by Admin on 12.02.2016.
 */
public class Outer {
    class Inner{
        Inner(String p){}
    }
}

class Outer2 extends Outer{
    class Inner2 extends Outer.Inner{

        Inner2(String p) {
            super(p);
        }
    }
}

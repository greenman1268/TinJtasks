package hometasks.Chapter12.task14;

/**
 * Created by Admin on 01.03.2016.
 */
//403
class First extends Exception{First(String str){super(str);}}
class Second extends First{Second(String str){super(str);}}
class Third extends Second{Third(String str){super(str);}}

public class Exceptions {
    void method() throws First {throw new First("first");}
}
class Exceptions2 extends Exceptions {
    void method() throws Second {throw new Second("second");}
}
class Exceptions3 extends Exceptions2 {
    void method() throws Third {throw new Third("third");}

    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions3();
        try {
            exceptions.method();
        } catch (First first) {
            first.printStackTrace();
        }
    }
}


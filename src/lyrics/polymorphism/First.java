package lyrics.polymorphism;

/**
 * Created by Grisha on 31.01.2016.
 */
public class First {
    public void f(){s();}
    public void s(){
        System.out.println("from First");
    }
}
class Second extends First{
    public void s(){
        System.out.println("from Second");
    }
}


class Yopta {

    public static void main(String[] args) {
        First first = new Second();
        first.f();

    }
}

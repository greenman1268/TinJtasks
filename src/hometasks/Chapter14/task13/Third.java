package hometasks.Chapter14.task13;

/**
 * Created by Admin on 15.03.2016.
 */
public class Third {
   static  <T extends Inter> void method(T p){
        Inter l = p;
        p.method1();
        p.method2();
       // p.method3();
    }

    public static void main(String[] args) {
        method(new Realize());
    }
}

package extending3;

/**
 * Created by Grisha on 30.01.2016.
 */
public class First {
    void method(int i){
        System.out.println(i);
    }
    void method1(char c){
        System.out.println(c);
    }
    void method2(float p){
        System.out.println(p);
    }
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
class Second extends First{


    public static void main(String[] args) {
        Second second = new Second();
        First f = second;

        second.method1('p');
        second.method2((float) 23.333);
        second.method(1);
    }
}

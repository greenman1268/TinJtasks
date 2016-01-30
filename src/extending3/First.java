package extending3;

/**
 * Created by Grisha on 30.01.2016.
 */
public class First {
    void method(int i){
        System.out.println(i);
    }
    void method(char c){
        System.out.println(c);
    }
    void method(float p){
        System.out.println(p);
    }
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
class Second extends First{
    @Override
    void method (int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Second second = new Second();
        second.method('p');
        second.method((float)23.333);
        second.method(1);
    }
}

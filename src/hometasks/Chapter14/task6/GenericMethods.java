package hometasks.Chapter14.task6;

/**
 * Created by Grisha on 10.03.2016.
 */
public class GenericMethods {
    public <A,B,C> void f(A k,String p,C c){
        System.out.println(k.getClass().getSimpleName()+" "+p.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods m = new GenericMethods();
        m.f("1A","2A","3A");
    }
}

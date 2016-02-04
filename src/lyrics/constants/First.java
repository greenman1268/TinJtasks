package lyrics.constants;

/**
 * Created by Grisha on 30.01.2016.
 */
public class First {
    static final int p = 5;
    public First(double p){}
    public First(){}
    private void method (int k){
       System.out.println(k);
   }
}
class Second extends First{

    public Second(int l) {

    }

    void method(int k){
        System.out.println(k);
    }

}

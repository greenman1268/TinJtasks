package lyrics.interfacePackage;

/**
 * Created by Grisha on 01.02.2016.
 */
public class Second implements First {
    int k;
    @Override
    public void f() {
       k = First.k;
    }
}

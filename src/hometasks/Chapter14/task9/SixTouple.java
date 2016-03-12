package hometasks.Chapter14.task9;

/**
 * Created by Admin on 12.03.2016.
 */
public class SixTouple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E>{
    public final F sixth;
    public SixTouple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        sixth = f;
    }
    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ", " + fifth + "," + sixth + ")";
    }
}

package hometasks.Chapter14.task2;

/**
 * Created by Admin on 10.03.2016.
 */
public class SixTouple<A,B,C,D,E,F> {
    A aa;B bb;C cc;D dd;E ee;F ff;
    public SixTouple(A a,B b,C c,D d,E e,F f) {
        aa = a;
        bb = b;
        cc = c;
        dd = d;
        ee = e;
        ff = f;
    }
    public void show(){
        System.out.println("aa= "+aa+" \n"+"bb= "+bb+" \n"+"cc= "+cc+" \n"+"dd= "+dd+" \n"+"ee= "+ee+" \n"+"ff= "+ff);
    }
}
class A{ public A() { System.out.println("It's A"); }}
class B{ public B() { System.out.println("It's B"); }}
class C{ public C() { System.out.println("It's C"); }}
class D{ public D() { System.out.println("It's D"); }}
class E{ public E() { System.out.println("It's E"); }}
class F{ public F() { System.out.println("It's F"); }}

class Test{
    public static void main(String[] args) {
        SixTouple<A,B,C,D,E,F> st = new SixTouple<>(new A(),new B(),new C(),new D(),new E(),new F());
    }
        }
package hometasks.Chapter12.task3;

/**
 * Created by Admin on 29.02.2016.
 */
//376
public class MyException1 extends Exception{
    int x;
    public MyException1() {}
    public MyException1(String msg) {super(msg);}
    public MyException1(String msg,int x) {super(msg);this.x=x;}
    public int val(){return x;}

    @Override
    public String getMessage() {
        return super.getMessage()+" this "+x;
    }
}

class Test{
    public static void main(String[] args) {

//        try {
//            throw new MyException1();
//        } catch (MyException1 myException1) {
//            myException1.printStackTrace();
//        }
//
//        try {
//            throw new MyException1("sec");
//        } catch (MyException1 myException1) {
//            myException1.printStackTrace();
//        }

        try {
            throw new MyException1("third", 234);
        } catch (MyException1 myException1) {
            myException1.printStackTrace(System.out);
        }
    }
}

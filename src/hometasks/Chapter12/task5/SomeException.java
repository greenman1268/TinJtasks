package hometasks.Chapter12.task5;

import java.util.Collection;

/**
 * Created by Grisha on 29.02.2016.
 */
 //385
public class SomeException extends RuntimeException {
}

class Exception2 extends Exception{

}

class SomeClass{
    public void f(){
        try {

        try {
            g();
        } catch (SomeException e) {
            e.printStackTrace();
            try {
                throw new Exception2().initCause(new SomeException());
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }}
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void g() throws SomeException {throw new SomeException();}
}

class Main{
    public static void main(String[] args) {
        new SomeClass().f();
    }
}
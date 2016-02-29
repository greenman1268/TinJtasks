package hometasks.Chapter12.task4;

/**
 * Created by Admin on 29.02.2016.
 */
//378
import java.util.*;

public class ExcepTester {
    public static void caller()throws Excep1, Excep2, Excep3{
        switch (new Random(47).nextInt(3)){
            case 0 : throw new Excep1("Excep1");
            case 1 : throw new Excep2("Excep2");
            case 2 : throw new Excep3("Excep3");}
    }

    public static void main(String[] args) {
        try {
            caller();
        }catch (NullPointerException e){
            System.out.println("nullpointer");
            e.printStackTrace();
        }
        catch (Exception excep) {
            excep.printStackTrace();
        } /*catch (Excep2 excep2) {
            excep2.printStackTrace();
        } catch (Excep3 excep3) {
            excep3.printStackTrace();
        }*/
        finally {
            System.out.println("This is finally");
        }
    }
}

class Excep1 extends NullPointerException{
    public Excep1(String message) {
        super(message);
    }
}
class Excep2 extends NullPointerException{
    public Excep2(String message) {
        super(message);
    }
}
class Excep3 extends NullPointerException{
    public Excep3(String message) {
        super(message);
    }
}
package hometasks.Chapter13.task19;

/**
 * Created by Admin on 03.03.2016.
 */
//458
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface Another{}

class Toy{
    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots,Another{
    FancyToy(){super(1);}
}
public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Class name: " + cc.getName() + " is Interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("hometasks.Chapter13.task19.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("FancyToy not found");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())printInfo(face);

        Class up = c.getSuperclass();
        Object object = null;
        try{
            object = up.newInstance();
        }catch (InstantiationException e){
            System.out.println("Can't create instance");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("Access Denied");
            System.exit(1);
        }
        printInfo(object.getClass());
    }
}

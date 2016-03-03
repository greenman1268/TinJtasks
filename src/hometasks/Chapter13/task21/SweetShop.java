package hometasks.Chapter13.task21;

/**
 * Created by Admin on 03.03.2016.
 */
//458
class Candy {
    static {
        System.out.println("Downloading Candy");
    }
}
class Gum {
    static {
        System.out.println("Downloading Gum");
    }
}
class Cookie {
    static {
        System.out.println("Downloading Cookie");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("int the main");
        new Candy();
        System.out.println("after Candy");
        try {
            Class.forName("hometasks.Chapter13.task21.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("Gum isn't found");
        }
        System.out.println("after Gum");
        new Cookie();
        System.out.println("after Cookie");

        System.out.println("--------------------------TASK 7");
        Class c = null;
        try {
          c = Class.forName(args[0]);
        }catch (ClassNotFoundException e){
            System.out.println("Some trouble");
        }
        System.out.println(c.getSimpleName());
    }
}

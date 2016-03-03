package hometasks.Chapter13.task23;

/**
 * Created by Admin on 03.03.2016.
 */
//458
public class IsCharacter {
    public static void main(String[] args) {
        char[] p = {'k','p','s'};

        System.out.println("p is PRIMITIVE? "+p.getClass().isPrimitive());
        System.out.println("p is real Object? "+p.getClass().isInstance(Character.class));
    }
}

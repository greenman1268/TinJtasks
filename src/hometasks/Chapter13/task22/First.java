package hometasks.Chapter13.task22;

import java.lang.reflect.Field;

/**
 * Created by Admin on 03.03.2016.
 */
//458
public class First {
    String p = "asd";
}
class Second extends First{
    int k = 1;
    Third p = new Third();
}
class Third extends Second{
    void method (){}
}
class Test{
    static void recursion(Class c){
        Class superC = null;
        if (!c.getSimpleName().equals("Object")){superC = c.getSuperclass();
            System.out.println("Class: |"+c.getSimpleName()+"| SuperClass: |"+superC.getSimpleName()+"|");}
        if (c.getSimpleName().equals("Object")) System.out.println("Class: |"+c.getSimpleName()+"|");



        System.out.println("Fields:");
        for (Field f : c.getDeclaredFields()){
            System.out.println(f.toString());
        }
        if (!c.getSimpleName().equals("Object")) {recursion(superC);}
    }
    public static void main(String[] args) {
        Class c = null;
        try {
           c = Class.forName("hometasks.Chapter13.task22.Third");
        } catch (ClassNotFoundException e) {
            System.out.println("Something Wrong!");
            System.exit(1);
        }
        recursion(c);

    }
}

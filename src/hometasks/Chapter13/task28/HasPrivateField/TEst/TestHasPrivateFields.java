package hometasks.Chapter13.task28.HasPrivateField.TEst;

import hometasks.Chapter13.task28.HasPrivateFields.HasPrivateFields;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Admin on 10.03.2016.
 */
public class TestHasPrivateFields {

    static void callHiddenMethod(Object o, String name)throws Exception{
        Method g = o.getClass().getDeclaredMethod(name);
        g.setAccessible(true);
        g.invoke(o);
    }

    static void callHiddenField(Object o, String name)throws Exception{
        Field f = o.getClass().getDeclaredField(name);
        f.setAccessible(true);
        String NameOfFiled = f.get(o).toString();
        System.out.print("Hidden field " + NameOfFiled + " ");
        f.set(o,NameOfFiled+" changed");
        NameOfFiled = f.get(o).toString();
        System.out.print("   --> "+NameOfFiled);
        System.out.println();
    }

    public static void main(String[] args) {
        HasPrivateFields h = new HasPrivateFields();
        System.out.println("-------------It's Hidden Methods---------------");
        try {
            callHiddenMethod(h,"PublicM");
            callHiddenMethod(h,"ProtectedM");
            callHiddenMethod(h,"PackageM");
        } catch (Exception e) {
            System.out.println("Something Wrong callHiddenMethod!!!!");
        }
        System.out.println("-------------It's Hidden Fields----------------");
        try {
            callHiddenField(h,"Public");
            callHiddenField(h,"Private");
            callHiddenField(h,"Protected");
            callHiddenField(h,"Package");
        } catch (Exception e) {
            System.out.println("Something Wrong callHiddenField!!!!");
        }
    }
}

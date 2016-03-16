package hometasks.Chapter14.task15;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Admin on 15.03.2016.
 */
public class ReflClass {
    String name;
    int k;
   public ReflClass(String s, Integer i){
        System.out.println("CREATED");
        this.name = s;
       this.k = i;
            }
    void m(){
        System.out.println("METHOD");
    }
    public String toString(){
        return this.name + " " + this.k;
    }
}

class Exper<T> {
    private Class<T> kind;
    public Exper(Class<T> kind){this.kind = kind;}
    public ReflClass method(String s,int k){
            ReflClass rf = null;
        try {
         rf = (ReflClass)kind.getConstructor(String.class,Integer.class).newInstance(s,k);

        }/*catch (ClassNotFoundException e){
            e.printStackTrace();
        }*/
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e){
            e.printStackTrace();
        }
        /*catch (NoSuchFieldException e) {
            e.printStackTrace();
        }*/
        catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return rf;
    }

    public static void main(String[] args) {
      Exper<ReflClass> r = new Exper<>(ReflClass.class);
        ReflClass k = r.method("Name",26);
        System.out.println(k);




      /*  try {

            ReflClass.class.getDeclaredMethod("m").invoke(new ReflClass());

        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }*/
    }

}

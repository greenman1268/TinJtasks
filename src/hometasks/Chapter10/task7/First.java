package hometasks.Chapter10.task7;

/**
 * Created by Admin on 06.02.2016.
 */
public class First {
    private static int field = 3;
    private void setField(int k){
         field = k;
    }
    class Inner{
        void method(){
            setField(5);
            System.out.println(field);
        }
    }
   static private void anothermethod(){
        Inner inner = new First().new Inner();
        inner.method();

    }

    public static void main(String[] args) {
        anothermethod();
        System.out.println();
    }

}

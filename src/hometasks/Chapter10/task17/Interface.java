package hometasks.Chapter10.task17;

/**
 * Created by Admin on 07.02.2016.
 */
public interface Interface {
    void method();
    class Inner implements Interface{
        public static void printer(){
            Inner i = new Inner();
            i.method();
            System.out.println("I'm from Inner");
        }

        @Override
        public void method() {
            printer();
        }
    }
}

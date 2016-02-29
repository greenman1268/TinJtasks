package hometasks.Chapter12.task10;

/**
 * Created by Grisha on 29.02.2016.
 */
//394
    class Exception1 extends Exception{
    @Override
    public String toString() {
        return "Exception1111";
    }
}
    class SecondExc extends Exception{
        @Override
        public String toString() {
            return "SecondExc";
        }
    }
public class LostMessage {
    void f() throws Exception1{ throw new Exception1(); }
    void dispose()throws SecondExc{ throw new SecondExc(); }

    public static void main(String[] args) {
        try{
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            }finally {
               try {
                   lm.dispose();
               }catch (SecondExc e){
                   e.printStackTrace();
               }finally {
               }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

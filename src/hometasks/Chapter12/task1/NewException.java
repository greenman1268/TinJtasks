package hometasks.Chapter12.task1;

/**
 * Created by Admin on 29.02.2016.
 */
//372.1
public class NewException {
    public static void main(String[] args) {
        int i = -2;
        while (i<10){
            try {
                System.out.println(2/++i);
                if(i==9)i=-1;

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }


        String s = null;

        try {
           // throw new Exception("Hello");
           // s.length();
           /* int[] k = new int[5];
            k[6] = 10;*/
           // throw new MyExeption("it's new exception");
               }
      /*  catch (MyExeption e){
            System.out.println(e.getMessage());
        }*/
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("it's "+e);
        }
        catch (NullPointerException e){
            System.out.println("it's "+e);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("It's finally");
        }
    }
}

class MyExeption extends Exception{
    private String message;

    MyExeption(String msg){
        this.message = msg;
    }

    public String getMessage(){

        return message;
    }
}

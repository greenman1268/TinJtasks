package lyrics.extending2;

/**
 * Created by Grisha on 30.01.2016.
 */
public class First {
    public First(int i) {
        System.out.println("First "+i);
    }
}
class Second extends First{
  /*  public Second(double f) {
        super(11);
        System.out.println("Second "+f);
    }*/
    public Second(int p){
        super(3);


    }
}
class Third extends Second{
    public Third(){
        super(22);
        System.out.println("Third");
    }

    public static void main(String[] args) {
        Third third = new Third();
    }
}

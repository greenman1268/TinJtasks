package extending;

/**
 * Created by Grisha on 28.01.2016.
 */

class Second{
    private String s = "Second";
    public void append(String a){s+=a;}
    public void scrub(){append(" scrub()");}
    public String toString(){return s;}
}

public class First extends Second{
   public void scrub(){
       append(" First.scrub()");
      // super.scrub();
   }
    public void sterilize(){append(" sterilize()");}

    public static void main(String[] args) {
        First f = new First();
        f.scrub();
        f.sterilize();
        System.out.println(f);
    }
}



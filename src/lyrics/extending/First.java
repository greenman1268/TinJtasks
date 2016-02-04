package lyrics.extending;

/**
 * Created by Grisha on 28.01.2016.
 */

class Second{
    private String s = "Second";
    void append(String a){s+=a;}
    void scrub(){append(" scrub()");}
    public String toString(){return s;}
}

public class First {
    Second second = new Second();
    public void append(String s){second.append(s);}
   public void scrub(){
       second.scrub();
      // super.scrub();
   }
    public String toString(){return second.toString();}
    public void sterilize(){append(" sterilize()");}

    public static void main(String[] args) {
        First f = new First();
        f.scrub();
        f.sterilize();
        System.out.println(f);
    }
}



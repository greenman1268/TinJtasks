package hometasks.Chapter10.task14;

/**
 * Created by Admin on 07.02.2016.
 */
public class First {
    public First(String s){

    }
}

class Second{
    private class Inner extends First{
        public Inner(String s) {
            super(s);
        }
    }
    First method(){return new Inner("from Second");}

}

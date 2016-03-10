package hometasks.Chapter14.task1;

/**
 * Created by Admin on 10.03.2016.
 */
public class Base {
    public Base() {
        System.out.println(getClass().getSimpleName());
    }
    public String toString(){
        return getClass().getSimpleName();
    }
}
class Extented extends Base{
}

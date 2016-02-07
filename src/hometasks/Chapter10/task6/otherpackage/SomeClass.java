package hometasks.Chapter10.task6.otherpackage;

/**
 * Created by Admin on 06.02.2016.
 */
import hometasks.Chapter10.task6.*;
public class SomeClass {
   public OtherClass p = new OtherClass();
    protected class OtherClass implements SomeInterface{

        @Override
        public SomeInterface method() {
            return new OtherClass();
        }

    }

}

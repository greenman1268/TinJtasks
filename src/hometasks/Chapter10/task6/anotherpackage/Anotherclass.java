package hometasks.Chapter10.task6.anotherpackage;

/**
 * Created by Admin on 06.02.2016.
 */
import hometasks.Chapter10.task6.SomeInterface;
import hometasks.Chapter10.task6.otherpackage.SomeClass;

public class Anotherclass extends SomeClass {

    SomeInterface met(){
        return new SomeInterface(){

            @Override
            public SomeInterface method() {

                return new SomeClass().p;
            }
        };
    }

}

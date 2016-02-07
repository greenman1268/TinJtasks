package hometasks.Chapter10.task11;

/**
 * Created by Admin on 07.02.2016.
 */
public interface SomeInterface {
    public void method();
}

class ClassReturn{
    public SomeInterface someInterface(){
        return new SomeInterface() {
            @Override
            public void method() {

            }
        };
    }
}
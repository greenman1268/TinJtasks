package hometasks.Chapter10.task10;

/**
 * Created by Admin on 06.02.2016.
 */
public class Outer {
    private Inter method(){
        return new Inter() {
            @Override
            public String method() {
                return "fuck";
            }

        };
    }
}
interface Inter{
    String method();
}

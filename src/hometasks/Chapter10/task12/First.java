package hometasks.Chapter10.task12;

/**
 * Created by Admin on 07.02.2016.
 */
public class First {
    private class OtherInner implements ThisInterface{}
    public ThisInterface method (){
        return new OtherInner(){
        };
    }
    public void otherMethod(){        OtherInner o = (OtherInner)method();
    }

}
interface ThisInterface{

}


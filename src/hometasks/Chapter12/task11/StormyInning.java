package hometasks.Chapter12.task11;

/**
 * Created by Grisha on 29.02.2016.
 */
//397
class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireException extends Exception{}
class From extends UmpireException{}

abstract class Inning{
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    public abstract void atBat() throws Strike, Foul;
    public void walk(){}
    public void method()throws From{};

}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm{
    public StormyInning()throws RainedOut, BaseballException{}
    public StormyInning(String s)throws Foul, BaseballException{}
    @Override
    public void atBat() {
    }
    public void method(){}
    public void event(){}
    @Override
    public void rainHard() throws RainedOut {
    }

    public static void main(String[] args) {
        try{
            StormyInning si = new StormyInning();
            si.atBat();
        }catch (PopFoul e){
            System.out.println("Pop foul");
        }catch (RainedOut e){
            System.out.println("Rained out");
        }catch (BaseballException e){
            System.out.println("Generick baseball exception");
        }

        try{
            Inning i = new StormyInning();
            i.atBat();
        }catch (Strike e){
            System.out.println("Strike");
        }catch (Foul e){
            System.out.println("Foul");
        }catch (RainedOut e){
            System.out.println("Rained out");
        }catch (BaseballException e){
            System.out.println("Generic exception");
        }
    }
}

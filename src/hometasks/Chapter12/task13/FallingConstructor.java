package hometasks.Chapter12.task13;

/**
 * Created by Admin on 01.03.2016.
 */
//401
class Disposer {
    public void dispose(){
        System.out.println("Dispose from Disposer");
    }
}
public class FallingConstructor {
    Disposer disposer;
    public FallingConstructor() {
        try{
        disposer = new Disposer();
            System.out.println("Make disposer");
        throw new Exception();}
        catch (Exception e){
            System.out.println("Exception");
            disposer.dispose();
        }
    }

    public void dispose(){
        System.out.println("Dispose from FallingConstructor");
    }

    public static void main(String[] args) {
        FallingConstructor f = null;

        try{
            f = new FallingConstructor();
            throw new RuntimeException();
    }catch (RuntimeException e){
            f.dispose();
        }
}}


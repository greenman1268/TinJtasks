package hometasks.Chapter12.task9;

/**
 * Created by Grisha on 29.02.2016.
 */
//392
    class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
    protected void dispose(){
        System.out.println("Finishing Characteristic " + s);
    }
}

class Description {
    private String s;
    Description (String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
    protected void dispose(){
        System.out.println("Finishing Description " + s);
    }
}

class LivingCreature {
    private Characteristic p = new Characteristic("Living Creature ");
    private Description t = new Description("Just Living Creature");
    LivingCreature(){
        System.out.println("livingCreature()");
    }
    protected void dispose(){
        System.out.println("dispose() of LivingCreature ");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic p = new Characteristic("Has a hert");
    private Description t = new Description("animal, not a plant");

    Animal(){
        System.out.println("Animal");}
    protected void dispose() {
        System.out.println("dispose() of Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("in water, and on the land");
    Amphibian(){
        System.out.println("Amphibian()");
    }
    protected  void dispose(){
        System.out.println("dispose() in Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("croaks");
    private Description t = new Description("eats a bugs");

    public Frog(){
        System.out.println("Frog()");
    }
    protected void dispose(){
        System.out.println("Finishing Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = null;
        try{
        frog = new Frog();
        System.out.println("Bye!!!");
            if(frog!=null){
                System.out.println("RETURN HERE!!!!!!!!!!!!!");return;}
        frog.dispose();}
        catch (Exception e){}
        finally {
           frog.dispose();
        }
    }
}

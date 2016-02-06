package hometasks.Chapter9.task9;

/**
 * Created by Admin on 06.02.2016.
 */
//task9
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

interface Playable {
    void play(Note n);
}
abstract class Instrument implements Playable{
    int VALUE = 5;

    abstract void adjust();
}

class Wind extends Instrument{

    @Override
   public void play(Note n) {
        System.out.println(this+" play "+n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    void adjust() {

    }
}

class Percussion extends Instrument implements Playable{

    @Override
   public void play(Note n) {
        System.out.println(this+" play "+n);
    }

    @Override
    void adjust() {

    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

public class music5 {
    static void tune(Playable i){
        i.play(Note.C_SHARP);
    }
    static void tuneall(Instrument[] e){
        for (Instrument i:e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra =  {
            new Wind(),
            new Percussion()
        };
        tuneall(orchestra);
    }
}

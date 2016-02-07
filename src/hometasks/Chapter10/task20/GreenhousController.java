package hometasks.Chapter10.task20;

import java.util.*;

/**
 * Created by Admin on 07.02.2016.
 */
public class GreenhousController {
    public static void main(String[] args) {
        /*GreenhouseControls gc = new GreenhouseControls();

        gc.addEvent(gc.new Bell(900));
        Event[] events = {
                gc.new VentilationMax(0),
                gc.new LightOn(200),
                gc.new VentilationNorm(400),
                gc.new LightOff(600),
        };

        gc.addEvent(gc.new Restart(2000, events));
        if(args.length == 1){
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));gc.run();
        }*/

        System.out.println("IT'S TIME FOR NEW VERSION");
        GC2 gc2 = new GC2();

        gc2.addEvent(gc2.new Bell(1000));
        Event[] events2 = {
                gc2.new VentilationMax(0),
                gc2.new LightOn(200),
                gc2.new VentilationNorm(400),
                gc2.new LightOff(600),
                gc2.new HumidificationMuch(10000)
        };

        gc2.addEvent(gc2.new Restart(20000, events2));
        if(args.length == 1){
           gc2.addEvent(new GC2.Terminate(new Integer(args[0])));gc2.run();
        }
    }
}

class GC2 extends GreenhouseControls{
    private String humidification = "Much";
public class HumidificationMuch extends Event{

    @Override
    public String toString() {
        return "Humidification is enabled to Much";
    }

    public HumidificationMuch(long delayTime) {
        super(delayTime);
    }

    @Override
    public void action() {
        humidification = "Much";

    }
}
}

abstract class Event{
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }
    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}

class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c){eventList.add(c);}
    public void run(){
        while (eventList.size()>0)
            for (Event e : new ArrayList<Event>(eventList))
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
    }
}

class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event{
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
        light = true;
        }

        @Override
        public String toString() {
            return "Light on";
        }
    }

    public class LightOff extends Event{

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
        light = false;
        }

        @Override
        public String toString() {
            return "Light off";
        }
    }

    private String ventilation = "max";

    public class VentilationMax extends Event{

        public VentilationMax(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            ventilation = "max";

        }

        @Override
        public String toString() {
            return "Ventilation is enabled to maximum";
        }
    }

    public class VentilationNorm extends Event{

        public VentilationNorm(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            ventilation = "norm";

        }

        @Override
        public String toString() {
            return "Ventilation is enabled to normal";
        }
    }

    public class Bell extends Event{

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "BANG!!!";
        }
    }

    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                    addEvent(e);
        }

        @Override
        public void action() {
            for (Event e : eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "System restart";
        }
    }

    public static class Terminate extends Event{

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
         public String toString() {
            return "Shutdown";
        }
    }
}

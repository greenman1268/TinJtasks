package hometasks.Chapter11.task10;

/**
 * Created by Admin on 26.02.2016.
 */
import java.util.*;
public class Command {
    static int iter = 0;
    String string="";
    public void operation (){
        System.out.println(string+" "+iter);
        iter++;
    }
}

class FillQueue {
    Queue<Command> queue = new LinkedList<>();
    public Command method(Command e){
        queue.offer(e);
       return e;

    }
}

class Iteration {
    public static void iteration(Queue<Command> queue){
        for (Command c : queue){
            c.operation();
        }
    }
}

class Main{
    public static void main(String[] args) {
        FillQueue fillQueue = new FillQueue();
        fillQueue.method(new Command()).operation();
        fillQueue.method(new Command()).operation();
        fillQueue.method(new Command()).operation();
        fillQueue.method(new Command()).operation();
        fillQueue.method(new Command()).operation();
    }
}
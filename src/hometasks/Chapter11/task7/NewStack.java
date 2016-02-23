package hometasks.Chapter11.task7;

/**
 * Created by Admin on 23.02.2016.
 */
import java.util.*;

public class NewStack<T> {
    LinkedList<T> list = new LinkedList<>();

    public void push(T v){list.addFirst(v);}
    public T peek(){return list.getFirst();}
    public T pop(){return list.removeFirst();}
    public boolean empty(){return list.isEmpty();}
    public String toString(){return list.toString();}
}

class Test{
    public static void main(String[] args) {
        NewStack<String> ns = new NewStack<>();
        ns.push("U");
        ns.push("n");
        ns.push("c");
        System.out.print(ns.pop());
        System.out.print(ns.pop());
        System.out.print(ns.pop());
        ns.push("e");
        ns.push("r");
        ns.push("t");
        System.out.print(ns.pop());
        System.out.print(ns.pop());
        System.out.print(ns.pop());
        ns.push("a");
        System.out.print(ns.pop());
        ns.push("i");
        System.out.print(ns.pop());
        ns.push("n");
        ns.push("t");
        ns.push("y");
        System.out.print(ns.pop());
        System.out.print(ns.pop());
        System.out.print(ns.pop());
        ns.push(" ");
        System.out.print(ns.pop());
        ns.push("r");
        ns.push("u");
        System.out.print(ns.pop());
        System.out.print(ns.pop());
        ns.push("l");
        ns.push("e");
        ns.push("s");
        System.out.print(ns.pop());
        System.out.print(ns.pop());
        System.out.print(ns.pop());

    }

}

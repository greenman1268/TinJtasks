package hometasks.Chapter14.task5;
//: generics/Fibonacci.java
// Generate a Fibonacci sequence.

import java.util.Iterator;

interface Generator<T> {T next();}

public class Fibonacci implements Generator<Integer> {
  private int count = 0;
  public Integer next() { return fib(count++); }
  private int fib(int n) {
    if(n < 2) return 1;
    return fib(n-2) + fib(n-1);
  }
}

class IterableClass implements Iterable<Integer>{
  private Fibonacci fibonacci = new Fibonacci();
  private int n;
  public IterableClass(int count){n = count;}
  public Iterator<Integer> iterator(){
    return new Iterator<Integer>() {
      @Override
      public boolean hasNext() {
        return n > 0;
      }

      @Override
      public Integer next() {
        n--;
        return fibonacci.next();
      }
    };
  }

  public static void main(String[] args) {
   for (int i : new IterableClass(18)){
     System.out.println(i);
   }
  }
}




/* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~

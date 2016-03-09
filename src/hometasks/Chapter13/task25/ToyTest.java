//: typeinfo/toys/ToyTest.java
// Testing class Class.
package hometasks.Chapter13.task25;

import java.lang.reflect.Constructor;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
  // Comment out the following default constructor
  // to see NoSuchMethodError from (*1*)
  public Toy() {
    System.out.println("It's Toy");
  }
  public Toy(int i) {
    System.out.println("It's Toy(int i)");
  }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
  FancyToy() { super(1); }
}

public class ToyTest {
  static void printInfo(Class cc) {
    System.out.println("Class name: " + cc.getName() +
            " is interface? [" + cc.isInterface() + "]");
    System.out.println("Simple name: " + cc.getSimpleName());
    System.out.println("Canonical name : " + cc.getCanonicalName());
  }
  public static void main(String[] args){
    Class<?> c = null;
    Constructor[] k = c.getConstructors();
    for (int i = 0; i < k.length; i++) {
      System.out.println(k[i]);
    }
    try {
      Class.forName(k[0].toString());
    } catch (ClassNotFoundException e) {
      System.out.println("Can't find");
    }


  }
} /* Output:
Class name: typeinfo.toys.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : typeinfo.toys.FancyToy
Class name: typeinfo.toys.HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name : typeinfo.toys.HasBatteries
Class name: typeinfo.toys.Waterproof is interface? [true]
Simple name: Waterproof
Canonical name : typeinfo.toys.Waterproof
Class name: typeinfo.toys.Shoots is interface? [true]
Simple name: Shoots
Canonical name : typeinfo.toys.Shoots
Class name: typeinfo.toys.Toy is interface? [false]
Simple name: Toy
Canonical name : typeinfo.toys.Toy
*///:~

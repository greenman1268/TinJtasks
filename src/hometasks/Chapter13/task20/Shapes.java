package hometasks.Chapter13.task20;

/**
 * Created by Admin on 03.03.2016.
 */
//458
import java.util.*;

abstract class Shape{
    boolean flag = false;
    void draw() {
        System.out.println(this + ".draw");
    }
    abstract public String toString();
}

class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle"+" flag: "+this.flag;
    }
}
class Square extends Shape {

    @Override
    public String toString() {
        return "Square"+" flag: "+this.flag;
    }
}
class Triangle extends Shape {

    @Override
    public String toString() {
        return "Triangle"+" flag: "+this.flag;
    }
}
class Rhomboid extends Shape {

    @Override
    public String toString() {
        return "Rhomboid"+" flag: "+this.flag;
    }
    public void method(){}
}
public class Shapes {
    public static void changeFlag(Shape shape){
        shape.flag = true;
    }
    public static void rotate(Shape shape){
        if(shape instanceof Circle) {System.out.println("Shape is Circle");
        Circle c = (Circle)shape;
            System.out.println(c);}
        else System.out.println("it's not a Circle");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Shape shape = new Rhomboid();
        Rhomboid rhomboid = new Rhomboid();
        if(rhomboid instanceof Rhomboid)rhomboid = (Rhomboid)shape;
        Circle circle = new Circle();
        boolean b = rhomboid instanceof Rhomboid;
        if(!b) circle = (Circle)shape;
        rotate(new Triangle());
        rotate(new Circle());
        System.out.println("-------------TASK 6");
        List<Shape> list = Arrays.asList(new Circle(),new Circle(),new Triangle(),new Rhomboid(),new Square(),new Rhomboid());
        for (Shape shape1 : list){
            if(shape1 instanceof Rhomboid){changeFlag(shape1);
                System.out.println(shape1);}
        }

    }
}

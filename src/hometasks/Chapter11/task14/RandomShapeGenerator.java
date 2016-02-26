package hometasks.Chapter11.task14;

/**
 * Created by Admin on 26.02.2016.
 */
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class RandomShapeGenerator implements Iterator<Shape>
{
    private int size = 0;
    Random random = new Random(47);
    public RandomShapeGenerator(int k) {
    this.size = k;
    }

    @Override
    public boolean hasNext() {
        return size>0;
    }

    @Override
    public Shape next() {
        Shape s;
        while (hasNext())
        return null;
    }
}

class Shape {
    public void draw(){}
    public void erase(){}
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Circle.draw");
    }
    public void erase(){
        System.out.println("Circle.erase");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("Square.draw");
    }
    public void erase(){
        System.out.println("Square.erase");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Triangle.draw");
    }
    public void erase(){
        System.out.println("Triangle.erase");
    }
}

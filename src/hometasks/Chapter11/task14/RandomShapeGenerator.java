package hometasks.Chapter11.task14;

/**
 * Created by Admin on 26.02.2016.
 */
//358

import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape>
{   private Random random = new Random(47);
    private List<Shape> list;

    public RandomShapeGenerator(){
        list = new ArrayList<>();
        list.add(new Circle());
        list.add(new Square());
        list.add(new Triangle());

    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<10;
            }

            @Override
            public Shape next() {
                index++;
                return list.get(random.nextInt(3));

            }
        };
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

class Test{

    public static void main(String[] args) {
        RandomShapeGenerator rand = new RandomShapeGenerator();
       for (Shape p : rand){
           p.draw();
       }
    }
}

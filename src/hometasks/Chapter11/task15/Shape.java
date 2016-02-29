package hometasks.Chapter11.task15;

/**
 * Created by Admin on 29.02.2016.
 */
//361
import java.util.*;

public class Shape {
    public void draw(){};
    public void erase(){};
}

class Triangle extends Shape{
    public void draw(){ System.out.println("Triangle.draw"); }
    public void erase(){ System.out.println("Triangle.erase"); }
}

class Circle extends Shape{
    public void draw(){ System.out.println("Circle.draw"); }
    public void erase(){ System.out.println("Circle.erase"); }
}

class Square extends Shape{
    public void draw(){ System.out.println("Square.draw"); }
    public void erase(){ System.out.println("Square.erase"); }
}

class NonCollectionSequence implements Iterable<Shape>{
    List<Shape> list = new ArrayList<>();
    {
        list.add(new Circle());
        list.add(new Square());
        list.add(new Triangle());
    }

   /* public Iterable<Shape> iterable(){
        return new Iterable<Shape>() {
            @Override
            public Iterator<Shape> iterator() {
                return new Iterator<Shape>() {
                    int index = 0;
                    @Override
                    public boolean hasNext() {
                        return index<list.size();
                    }

                    @Override
                    public Shape next() {
                        return list.get(index++);
                    }
                };
            }
        };
    }*/

    public Iterable<Shape> reversed(){
        return () -> new Iterator<Shape>() {
           int current = list.size()-1;
            @Override
            public boolean hasNext() {
                return current > -1;
            }

            @Override
            public Shape next() {
                return list.get(current--);
            }
        };
    }

    public Iterable<Shape> randomized(){
        return new Iterable<Shape>() {
            @Override
            public Iterator<Shape> iterator() {
                List<Shape> shuffle = new ArrayList<>(list);
                Collections.shuffle(shuffle,new Random(47));
                return shuffle.iterator();
            }
        };
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<list.size();
            }

            @Override
            public Shape next() {
                return list.get(index++);
            }
    };
}
}

class Test{
    public static void main(String[] args) {
        NonCollectionSequence non = new NonCollectionSequence();
        for (Shape s : non){
            s.draw();
        }
    }
}
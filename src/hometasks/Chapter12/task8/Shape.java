package hometasks.Chapter12.task8;

/**
 * Created by Grisha on 29.02.2016.
 */
//392
public class Shape {
    Shape(int i) { System.out.println("Construktor Shape"); }
    void dispose() { System.out.println("Finishing Shape"); }
    }

class Circle extends Shape {

    Circle(int i) {
        super(i);
        System.out.println("drawing Circle");
    }
    void dispose(){
        System.out.println("Wiping Circle");
        super.dispose();
    }
}

class Triangle extends Shape {

    Triangle(int i) {
        super(i);
        System.out.println("drawing Triangle");
    }
    void dispose(){
        System.out.println("Wiping Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("drawing Line: "+ start +", " + end);
    }
    void dispose(){
        System.out.println("Wiping Line: " + start + ", "+ end);
        super.dispose();
    }
}

class CADSystem extends Shape {

    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i) {
        super(i);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j*j);
            }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combine Constructor");
    }
    void dispose(){
        System.out.println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0 ; i--) {
            lines[i].dispose();
            }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            int k = 5;
            new Circle(2);
            if(k==5){
                System.out.println("RETURN HERE!!!!!!!!!!!!!");return;}
            new Circle(2);
            new Circle(2);


        }finally {
            x.dispose();
        }
    }
}

package d.inheritance;

abstract class Shape4{
    String color;
    Shape4(String color){
        this.color = color;
    }
    void displayInfo(){
        System.out.println(color);
    }
    abstract double getArea();
    abstract double getPerimeter();
}

class Circle4  extends Shape4{
    double radius;
    public Circle4(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }
    @Override
    double getPerimeter() {
        return 3.14 * radius * 2;
    }
}

class Rectangle4 extends Shape4{
    double width;
    double height;

    public Rectangle4(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width+height);
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        Shape4 c = new Circle4("red",5);
        Shape4 r = new Rectangle4("blue",10,15);

        c.displayInfo();
        r.displayInfo();

        System.out.println(c.getArea());
        System.out.println(r.getArea());
    }
}

package d.inheritance.Practice4;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Drawable {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle implements Drawable {
    private int base, height;
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Drawable[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4)
        };

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}

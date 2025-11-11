package d.inheritance;

interface Animal6{
    void run();
    void sleep();
    void eat();
}

class Dog6 implements Animal6{

    @Override
    public void run() {
        System.out.println("Dog Run");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Sleep");
    }

    @Override
    public void eat() {
        System.out.println("Dog Eat");
    }
}

interface Drawable{
    void draw();
}

class Rectangle6 implements Drawable {
    private int width,height;
    public Rectangle6(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("사각형 그리기");
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Animal6 d = new Dog6();
        d.run();
        d.sleep();
        d.eat();
    }
}

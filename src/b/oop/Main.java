package b.oop;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);

        Circle c3 = c2;

        System.out.println(c1.radius);
        System.out.println(c2.radius);
        System.out.println(c3.radius);

        c1.radius = 100;
        c2.radius = 200;

        System.out.println(c1.radius);
        System.out.println(c2.radius);
        System.out.println(c3.radius);

        Dog d1 = new Dog("뽀삐",1,"말티즈");
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.breed);

    }
}

package d.inheritance;

class Animal{
    String name;
    int age;

    void eat(){
        System.out.println("eat!!!!");
    }
}

class Dog extends Animal{
    String breed;
    void bark(){
        System.out.println("bark!!!!");
    }
}

class Cat extends Animal{
    int life;

    void meow(){
        System.out.println("meow!!!!");
    }
}

public class Basic {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}

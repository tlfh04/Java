package b.oop;

public class Dog {
    String name;
    int age;
    String breed;

    void bark() {
        System.out.println("왈왈");
    }

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        bark();
    }
}

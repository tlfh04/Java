package d.inheritance.Practice2;

class Animal{
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("크아앙");
    }
}
class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("사자 "+this.name+" : 어흥!");
    }
}

class Elephant extends Animal{
    public Elephant(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("코끼리 "+this.name+" : 뿌우우!");
    }
}
class Monkey extends Animal{
    public Monkey(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("원숭이 "+this.name+" : 끼끼!");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("심바",1),
                new Elephant("덤보",4),
                new Monkey("조조",3)
        };
        System.out.println("=== 먹이 시간 ===");
        for (Animal animal : animals) {
            feedingTime(animal);
        }
    }
    public static void feedingTime(Animal animal){
        animal.makeSound();
    }
}

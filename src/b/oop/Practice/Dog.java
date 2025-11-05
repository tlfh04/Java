package b.oop.Practice;

public class Dog {
    String breed;
    String name;

    public Dog(String breed,String name) {
        this.breed = breed;
        this.name = name;
    }
    public void sit(){
        System.out.println(breed+" "+name+" 가 앉았습니다.");
    }
    public void hand(){
        System.out.println(breed+" "+name+" 가 손을 내밀었습니다.");
    }
}

package d.inheritance.Practice;

class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void introduce(){

    }
}

class Student extends  Person{
    int StudentId;
    String major;
    public Student (String name,int age,String major,int StudentId){
        super(name,age);
        this.major=major;
        this.StudentId=StudentId;
    }
    @Override
    public void introduce(){
        System.out.println("안녕하세요, 저는 "+name+"입니다. "+age+"살이고, 학벅은 "+StudentId+"이며, "+major+"을 전공합니다.");
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Student s = new Student("김철수",20,"컴퓨터공학",2024001);
        s.introduce();
    }
}

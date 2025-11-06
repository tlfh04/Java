package c.oop2;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        setAge(age);
    }

    // getter
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.age = age;
    }
}

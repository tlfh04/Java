package c.oop2;

public class Student {
    private String name;
    private int score;

    private static int totalStudent = 0;
    private static int totalScore = 0;


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        totalStudent++;
        totalScore += score;
    }
    public static int getTotalStudent() {
        return totalStudent;
    }
    public static double getAverageScore() {
        return (double) totalScore / totalStudent;
    }
}

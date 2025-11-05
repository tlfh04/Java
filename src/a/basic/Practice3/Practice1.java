package a.basic.Practice3;

public class Practice1 {
    public static void main(String[] args) {
        int[] numbers = {45, 23, 78, 12, 89, 34};
        int max = 0;
        int min = 0;
        for (int number : numbers){
            if (max < number) {
                max = number;
            }
            if (min == 0){
                min = number;
            }
            if (min > number) {
                min = number;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

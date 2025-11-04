package a.basic.Practice2;

public class Practice12 {
    public static void main(String[] args) {
        int num = 12345;

        while (num > 0) {
            int result = num % 10;
            System.out.print(result);
            num = num / 10;
        }
    }
}

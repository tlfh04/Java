package a.basic.Practice2;

public class Practice11 {
    public static void main(String[] args) {
        int n = 5,factorial = n;
        for (int i = 1; i < n; i++) {
            factorial *= (n - i);
        }
        System.out.println("5! = "+factorial);
    }
}

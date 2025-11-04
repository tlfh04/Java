package a.basic.Practice2;

public class Practice6 {
    public static void main(String[] args) {
        int num = 17;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i+"는 소수입니다.");
            }
        }
    }
}

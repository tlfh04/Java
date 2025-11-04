package a.basic.Practice2;

public class Practice7 {
    public static void main(String[] args) {
        int num = 17;
        boolean isBreak = true;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                isBreak = false;
                break;
            }
        }
        if (isBreak) {
            System.out.println(num+"은 소수입니다.");
        }else{
            System.out.println(num+"은 소수가 아닙니다.");
        }
    }
}

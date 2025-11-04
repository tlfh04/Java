package a.basic.Practice2;

public class Practice9 {
    public static void main(String[] args){
        int a = 12;
        int b = 18;
        int gcd = 0;
        for (int i = 1;i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("최소공배수 : "+a*b/gcd);
    }
}

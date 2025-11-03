package a.basic;

public class Operator {
    public static void main(String[] args) {
        int c = 10;
        int d = 20;

        System.out.println(c + d);
        System.out.println(c % d);

        int x = 10;
        int y = 3;

        System.out.println(x / y);

        double result = (double) x / y;
        System.out.println(result);

        // 출력 전 증감
        System.out.println("x = " + ++x);
        // 출력 후 증감
        System.out.println("x = " + x++);
        // x값
        x += 5;
        System.out.println("x = " + x);

        String strA = "hello";
        String strB = "hello";
        String strC = new String("hello");

        System.out.println(strA == strB);
        System.out.println(strA == strC);

        System.out.println(strA.equals(strC));

        int myX = 0;
        if (myX != 0 && 10 / myX > 1) {
            System.out.println("실행x");
        }

        // 삼항연산자
        int age = 30;
        String adult = (age > 20) ? "성인" : "청소년";
        System.out.println(adult);

        // 비트연산자
        int a = 5;   // 0101
        int b = 3;   // 0011

        System.out.println("a & b = " + (a & b));   // 0001 = 1
        System.out.println("a | b = " + (a | b));   // 0111 = 7
        System.out.println("a ^ b = " + (a ^ b));   // 0110 = 6
        System.out.println("~a = " + (~a));         // -6

        // 시프트 연산
        System.out.println("a << 1 = " + (a << 1)); // 1010 = 10 (2배)
        System.out.println("a >> 1 = " + (a >> 1)); // 0010 = 2 (1/2)

        // 실용 예제: 2의 거듭제곱 체크
        int num = 16;
        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println(num + "은 2의 거듭제곱: " + isPowerOfTwo);

        int intC = 123456;
        System.out.println(intC << 1);
        System.out.println(intC >> 1);

    }
}

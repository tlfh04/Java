package a.basic;

public class Variable {
    public static void main(String[] args) {
        // 선언만
        int age;

        // 할당
        age = 25;

        // 선언과 동시에 초기화
        String name = "홍길동";

        // 여러 변수 동시 선언
        int x, y, z;
        x = 1;
        y = 2;
        z = 3;

        // 여러 변수 동시 선언 및 초기화
        int a = 10, c = 20, e = 30;

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);     // 불리언으로 변경 가능

        // int 1number = 10;  // 에러!
        int number1 = 10;     // 정상

        int _count = 10;      // 정상
        int $price = 100;     // 정상
        // int my-name = 10;  // 에러! (하이픈 사용 불가)

        // Camel Case
        String phoneNumber = "010-1234-5678";
        int teamMembersCount = 10;

        byte b = 100;
        short s = 30000;
        int i = 2000000000;
        long l = 9000000000L;  // L 또는 l 접미사 필수

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        // 언더스코어로 가독성 향상 (Java 7+)
        int million = 1_000_000;
        long bigNumber = 123_456_789_000L;
        System.out.println("백만: " + million);

        float f = 3.14f;      // f 또는 F 접미사 필수
        double d = 3.141592;

        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // 지수 표기법
        double scientific = 1.23e-4;  // 0.000123
        System.out.println("과학적 표기: " + scientific);

        // 실수 연산의 부정확성
        double result = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + result);  // 0.30000000000000004
    }
}

package a.basic;

public class Practice9 {
    public static void main(String[] args) {
        int math = 70, english = 80, science = 45;
        int evg = (math + english + science)/3;

        if (evg >= 60) {
            if (math < 40 ) {
                System.out.println("불합격 (수학)");
            }else if (english < 40) {
                System.out.println("불합격 (영어)");
            }else if (science < 40) {
                System.out.println("불합격 (과학)");
            }else {
                System.out.println("합격");
            }
        }
    }
}

package a.basic;

public class For {
    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i++ ) {
            System.out.println(i);
        }
        for (int i = 10 ; i > 0 ; i-- ) {
            System.out.println(i);
        }
        for (int i = 0 ; i < 10 ; i += 2 ) {
            System.out.println(i);
        }
        // 여러 변수 사용
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        for (int i = 1 ; i < 10 ; i++ ) {
            System.out.println(2+"x"+i+"="+i*2);
        }
        // 구구단
        for (int i = 2; i < 10 ; i++ ) {
            for (int j = 1; j < 10; j++ ) {
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        int j = 0;

        do{
            System.out.println(j);
            j++;
        }while(j < 10);

    }
}

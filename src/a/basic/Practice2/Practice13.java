package a.basic.Practice2;

public class Practice13 {
    public static void main(String[] args){
        int num = 12345;
        int result = 0;
        while (num > 0) {
            int num1 = num % 10;
            result += num1;
            num = num / 10;
        }
        System.out.println("자릿수 합: "+result);
    }
}

package a.basic;

public class Practice8 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 17;
        int max;
        if (a > b){
            max = a;
            if (a > c){
                max = a;
            }
        }else if (b > c ){
            max = b;
        }else {
            max = c;
        }
        System.out.println("최대값: "+max);
    }
}

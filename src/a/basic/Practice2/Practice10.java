package a.basic.Practice2;

public class Practice10 {
    public static void main(String[] args){
        int a=0,b=1;
        for (int i =0; i < 10; i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }
    }
}

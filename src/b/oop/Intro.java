package b.oop;

public class Intro {
    public static void main(String[] args) {
//        int width = 100;
//        int height = 200;
//
//        int area = width * height;
//
//        System.out.println(area);

        int rac1 = calArea(10,10);
        int rac2 = calArea(20,20);
        int rac3 = calArea(30,30);

        System.out.println(rac1);
    }
    public static int calArea(int width, int height){
        return width*height;
    }
}

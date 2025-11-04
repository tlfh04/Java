package a.basic.Practice;

public class Practice3 {
    public static void main(String[] args) {
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year+"년은 윤년입니다.");
        }else{
            System.out.println(year+"년은 윤년이 아닙니다.");
        }
    }
}

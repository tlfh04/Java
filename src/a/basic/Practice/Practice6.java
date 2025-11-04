package a.basic.Practice;

public class Practice6 {
    public static void main(String[] args) {
        int day = 6;
        String week = switch(day){
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "잘못된 날짜입니다";
        };
        if (day <= 5){
            System.out.println(day+": "+week+"은 평일입니다.");

        }else{
            System.out.println(day+": "+week+"은 주말입니다.");

        }
    }
}

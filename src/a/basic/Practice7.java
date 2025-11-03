package a.basic;

public class Practice7 {
    public static void main(String[] args) {
        double height = 175.0;
        double weight = 70.0;
        double bmi = weight / (height/100 * height/100);
        String state;
        if (bmi < 18.5) {
            state = "저체중";
        }else if (bmi >= 18.5 && bmi < 23) {
            state = "정상";
        }else if (bmi >= 23 && bmi < 25) {
            state = "과체중";
        }else{
            state = "비만";
        }
        System.out.println("BMI: "+Math.round(bmi*100)/100.0);
        System.out.println(state+" 체중입니다.");
    }
}

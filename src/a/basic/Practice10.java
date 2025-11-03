package a.basic;

public class Practice10 {
    public static void main(String[] args) {
        int price = 120000;
        boolean isMember = true;
        double sale;
        int result;

        if (price >= 100000) {
            if (isMember) {
                sale = 15.0;
            } else {
                sale = 10.0;
            }
            result = (int) (price * (sale / 100));
        } else if (price >= 50000) {
            if (isMember) {
                sale = 10.0;
            }else{
                sale = 5.0;
            }
            result = (int) (price * (sale / 100));
        }else{
            if (isMember) {
                sale = 5.0;
            }else{
                sale = 0.0;
            }
            result = (int) (price * (sale / 100));
        }
        System.out.println("원가 : "+price+"원");
        System.out.println("할인율 : "+(int)(sale)+"%");
        System.out.println("최종 금액 : "+(price - result));
    }
}

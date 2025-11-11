package d.inheritance.Practice4;

interface Payment{
    void processPayment(int amount);
    String getPaymentMethod();
    default void printReceipt(int amount){
        System.out.println("영수증"+amount+"원 - "+getPaymentMethod());
    }
}
class CreditCardPayment implements Payment{
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println(getPaymentMethod()+" - "+cardNumber+" - "+amount+"원 결제 완료");
    }
    @Override
    public String getPaymentMethod() {
        return "CreditCard";
    }
}
class CashPayment implements Payment{
    @Override
    public void processPayment(int amount) {
        System.out.println(getPaymentMethod()+" - "+amount+"원 결제 완료");
    }

    @Override
    public String getPaymentMethod() {
        return "Cash";
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Payment[] payments = {
                new CreditCardPayment("1234-5678"),
                new CashPayment()
        };

        int amount = 50000;
        for (Payment payment : payments) {
            payment.processPayment(amount);
            payment.printReceipt(amount);
            System.out.println();
        }
    }
}

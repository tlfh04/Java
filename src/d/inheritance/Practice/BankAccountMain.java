package d.inheritance.Practice;

class Account{
    String accountNumber;
    double balance;
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("입금 "+amount);
    }
    public void withdraw(double amount){
        if (balance < amount) {return;}
        this.balance -= amount;
        System.out.println("출금 "+amount);
    }
}

class SavingsAccount extends Account{
    double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        if (balance <= 0) {
            System.out.println("잔액이 0 이하입니다");
            return;
        }
        double interest = balance * interestRate;
        this.balance += interest;
        System.out.println("이자 "+interest);
    }
}

class CheckingAccount extends Account{
    double overdraftLimit;
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount){
        double totalbalance = this.balance - amount;
        if (totalbalance >= -overdraftLimit){
            this.balance = totalbalance;
            System.out.println("출금 "+amount);
        }else{
            System.out.println("잔액부족");
        }
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA001", 1000000, 0.03);
        savings.deposit(500000);
        savings.addInterest();
        System.out.println("저축예금 잔액: " + savings.balance);

        CheckingAccount checking = new CheckingAccount("CA001", 100000, 500000);
        checking.withdraw(400000);
        System.out.println("입출금예금 잔액: " + checking.balance);
    }
}

package b.oop.Practice;

public class BankAccount {
    String accountNumber;
    int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("입금 "+ amount+"원"+" , "+"잔액: "+balance+"원");
    }
    public void withdraw(int amount){
        balance -= amount;
        System.out.println("출금 "+ amount+"원"+" , "+"잔액: "+balance+"원");
    }
    public void getBalance(){
        System.out.println("잔액: "+balance+"원");
    }

}

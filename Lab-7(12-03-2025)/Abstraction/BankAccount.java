package Lab_practice;

public abstract class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void withdraw();

    abstract void deposit();

    double getBalance() {
        return balance - 1000;
    }
    void display(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Main Balance : "+balance);
    }
}

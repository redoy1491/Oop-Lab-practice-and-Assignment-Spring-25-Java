package Lab_practice;

public class CheckAccount extends BankAccount {
    CheckAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw() {
        System.out.println("500 Taka withdraw done");
    }

    @Override
    void deposit() {
        System.out.println("12200 taka deposit done");
    }
}

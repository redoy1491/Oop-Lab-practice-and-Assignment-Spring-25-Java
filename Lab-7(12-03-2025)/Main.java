package Lab_practice;

public class Main {
    public static void main(String[] args) {
        BankAccount b = new CheckAccount(100001, 500000);
        b.display();
        System.out.println("Get Balance : " + b.getBalance());
        b.withdraw();
        b.deposit();

    }
}

package redoy;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Ashula", "Dhaka", "BD");
        Emp e = new Emp(178, "Redoy", address1);
        Bank bank = new Bank(e);
        bank.setBankname("DIU Bank");

        bank.display();
        e.display();
    }
}
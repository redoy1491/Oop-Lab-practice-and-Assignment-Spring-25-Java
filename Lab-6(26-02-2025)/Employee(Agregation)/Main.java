package redoy;

public class Main {
    public static void main(String[] args) {
        AddressInfo a= new AddressInfo("Narsingdi","Dhaka","1600");
        InsuranceInfo i = new InsuranceInfo("Daffodil",1001);
        Employee e = new Employee("Redoy",a,i);
    }
}
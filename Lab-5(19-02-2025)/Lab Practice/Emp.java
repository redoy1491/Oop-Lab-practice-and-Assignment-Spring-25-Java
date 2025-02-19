package redoy;

public class Emp extends Person {
    int id;
    String name;
    Address address;

    Emp(int id, String name, Address address) {
        this.address = address;
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("City : "+address.city +"\nState : "+ address.state + "\nCounty : " + address.country);
    }
}
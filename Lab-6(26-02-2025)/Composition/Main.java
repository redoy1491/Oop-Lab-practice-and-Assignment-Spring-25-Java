package Composition;

public class Main {
    public static void main(String[] args) {
        Car c= new Car("Volvo");
        c.startCar();

        Driver d=new Driver("Adib");
        Bus b = new Bus(d);
        b.showDriver();
    }
}

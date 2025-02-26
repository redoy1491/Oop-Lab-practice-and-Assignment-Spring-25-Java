package Lab_Task;

public class Volvo extends Car{
    private double price;
    private String productionYear;
    private String registrationNumber;
    Engine engine;
    Dashboard dashboard;

    Volvo(String model,String company,double price,String productionYear,String registrationNumber,Engine engine,Dashboard dashboard){
        super(model,company);
        this.price=price;
        this.productionYear=productionYear;
        this.registrationNumber=registrationNumber;
        this.engine=engine;
        this.dashboard=dashboard;

    }

    public void changeFuel(){
        System.out.println("Fuel is changing Now");
    }
    public void checkBattery(){
        System.out.println("Battery is checking Now");
    }
    void display(){
        super.display();
        System.out.println("Price : "+price);
        System.out.println("Production Year : "+productionYear);
        System.out.println("Registration Number : "+registrationNumber);
    }
}

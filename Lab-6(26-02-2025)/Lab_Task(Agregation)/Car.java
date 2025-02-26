package Lab_Task;

public class Car {
    protected String model,company;

    Car(String model,String company){
        this.model=model;
        this.company=company;
    }

    public void drive(){
        System.out.println("I am driving the car");
    }
    public void stop(){
        System.out.println("Stop Now");
    }
    void display(){
        System.out.println("Model : "+model);
        System.out.println("Company : "+company);
    }

}

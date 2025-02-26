package Composition;

public class Car {
    private Engine engine;

    Car(String engineType){
        this.engine=new Engine(engineType);
    }
    public void startCar(){
        engine.start();
        System.out.println("Start Car");
    }
}

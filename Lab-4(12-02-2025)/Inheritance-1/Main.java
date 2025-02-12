package org.redoy;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Ford");
        car.honk();
        System.out.println("Brand Name : " + car.getBrand()+"\nMOdelName : "+car.modelName);
    }
}
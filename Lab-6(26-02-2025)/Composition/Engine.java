package Composition;

public class Engine {
    private String type;

    Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Car is Starting");
    }
}

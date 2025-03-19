public class Main {
    public static void main(String[] args) {

        Machine c = new Car();
        c.start();
        c.stop();
        Machine w = new WaterPump();
        w.start();
        w.stop();
    }
}

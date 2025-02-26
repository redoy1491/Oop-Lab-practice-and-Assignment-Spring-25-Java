package Lab_Task;

public class Main {
    public static void main(String[] args) {
        Engine e = new Engine(100.5d);
        Dashboard d= new Dashboard(10.5d);
        Volvo v = new Volvo("Volvo","Toyta",11100000.5d,"2001","Rf256gh",e,d);
        v.display();
        e.display();
        d.display();
    }
}

//package redoy.labclass1practice;

public class MultiplicationTable {

    static void multiplicationTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + a + "=" + (i * a));
        }
    }

    public static void main(String[] args) {
        multiplicationTable(12);
    }
}

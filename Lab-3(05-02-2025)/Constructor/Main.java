package redoy.constructoroop2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object ob = new Object();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a(int) : ");
        int a = input.nextInt();
        System.out.print("Enter value of b(int) : ");
        int b = input.nextInt();
        System.out.print("Enter value of c(int) : ");
        int c = input.nextInt();
        int add = ob.Sum(a, b, c);
        System.out.println("The sum of 10 and 20 is " + add);

        System.out.print("Enter value of a(double) : ");
        double x = input.nextDouble();
        System.out.print("Enter value of b(double) : ");
        double y = input.nextDouble();
        System.out.print("Enter value of c(double) : ");
        double z = input.nextDouble();
        double add2 = ob.Sum(x, y, z);
        System.out.println("The sum of 10.5 and 20.5 is " + add2);

        System.out.print("Enter your first name : ");
        String firstName = input.next();
        System.out.print("Enter your Last name : ");
        String lastName = input.next();
        ob.Name(firstName, lastName);
    }
}

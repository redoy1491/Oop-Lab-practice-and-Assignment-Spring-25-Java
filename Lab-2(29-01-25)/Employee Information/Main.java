//package org.redoy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee e = new Employee();
        System.out.print("Enter Name ");
        e.name = input.nextLine();
        System.out.print("Enter Job Title : ");
        e.job = input.nextLine();
        System.out.print("Enter Salary : ");
        e.salary = input.nextInt();

        e.Display();
        e.incrementSalary(e.salary);
        e.claculateSalary(e.salary);

    }
}
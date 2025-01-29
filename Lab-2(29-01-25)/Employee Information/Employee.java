//package org.redoy;

public class Employee {
    String name;
    String job;
    int salary;


    void Display(){
        System.out.println("Name :"+name);
        System.out.println("Job Title  : "+job);
        System.out.println("Salary "+salary);
    }

    void incrementSalary(int salary){
        System.out.println("Incremented Salary : "+(salary+5000));
    }
    void claculateSalary(int salary){
        System.out.println("Next 12 Year Salary : "+salary*12);
    }

}

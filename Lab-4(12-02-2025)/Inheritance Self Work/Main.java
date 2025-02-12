package Lab.practice;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Ashraful Islam Redoy";
        employee.id = 178;
        employee.joiningDate = "12-02-2025";
        employee.display();

        SoftwerEngineer engineer = new SoftwerEngineer();
        engineer.salary = 50000;
        engineer.display();

        HR hr = new HR();
        hr.salary = 10000;
        hr.display();

        System.out.println("Employee name: " + hr.name);

    }
}

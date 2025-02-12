package org.redoy;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Ashraful Islam Redoy");
        System.out.println("Name: " + p.getName());
        p.setAge(21);
        System.out.println("Age : " + p.setAge());

        Person p1 = new Person("Tamim Ikbal", 30,178);
        p1.display();

    }
}
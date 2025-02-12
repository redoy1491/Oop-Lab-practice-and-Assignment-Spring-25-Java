package org.redoy;

public class Person {
    private String name;
    private int age;
    public int id;

    Person(){
        System.out.println("Blank constructor");
    }
    Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}

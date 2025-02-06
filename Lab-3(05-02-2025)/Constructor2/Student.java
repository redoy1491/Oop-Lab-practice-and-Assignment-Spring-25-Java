package LabConstructor;

public class Student {
    int id;
    String name;

   public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(){
        System.out.println("Student constructor Blank");
    }
    void display() {
        System.out.println(id + " " + name);
    }
}

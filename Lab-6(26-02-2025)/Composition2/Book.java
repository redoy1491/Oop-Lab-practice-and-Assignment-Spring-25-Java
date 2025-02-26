package Composition2;

public class Book {
    private String title;

    Book(String title){
        this.title=title;
    }
    public void display(){
        System.out.print(title+" ");
    }
}

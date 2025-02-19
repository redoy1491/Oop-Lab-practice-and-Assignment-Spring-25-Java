package redoy;

public class Book {
    String title;
    int price;
    Author author;

    Book(String title,int price,Author author){
        this.title=title;
        this.price=price;
        this.author=author;
    }
    void display(){
        System.out.println("Title Name : "+title);
        System.out.println("Price : "+price);
        System.out.println("Author Name : "+author.name);
        System.out.println("Fiction Name : "+author.fictionName);
    }
}

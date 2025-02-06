package redoy.Book;

public class Book {
    String title;
    String author;
    int price;

    public Book() {
        System.out.println("Book Constructor Blank");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title+"\nAuthor: " + author+"\nPrice: " + price);

    }
}

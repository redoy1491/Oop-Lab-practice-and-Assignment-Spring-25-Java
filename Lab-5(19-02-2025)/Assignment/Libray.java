package redoy;

public class Libray {
    int numBook;
    Book book;

    Libray(int numBook,Book book){
        this.numBook=numBook;
        this.book=book;
    }

    void addBook(){
        System.out.println("Add More Book");
    }
    void display(){
        System.out.println("Number Of Book : "+numBook);
    }
}

package redoy;

public class LiteratureBokk {
    int num_academicBook;
    int num_author;
    Book book;

    LiteratureBokk(int num_academicBook,int num_author,Book book){
        this.num_academicBook=num_academicBook;
        this.num_author=num_author;
        this.book=book;
    }

    void display(){
        System.out.println("Number of author(LiteratureBokk) : "+num_academicBook);
        System.out.println("Number of author(LiteratureBokk) : "+num_author);
    }
}

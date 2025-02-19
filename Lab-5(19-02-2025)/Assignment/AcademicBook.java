package redoy;

public class AcademicBook {
    int num_academicBook;
    int num_author;
    Book book;

    AcademicBook(int num_academicBook,int num_author,Book book){
        this.num_academicBook=num_academicBook;
        this.num_author=num_author;
        this.book=book;
    }

    void display(){
        System.out.println("Number of author(AcademicBook) : "+num_academicBook);
        System.out.println("Number of author(AcademicBook) : "+num_author);
    }
}

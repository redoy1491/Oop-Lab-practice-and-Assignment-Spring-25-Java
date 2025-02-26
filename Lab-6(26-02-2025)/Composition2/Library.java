package Composition2;

public class Library {
    private Book[] books;

    Library(String[] bookTitles) {
        books = new Book[bookTitles.length];
        for (int i = 0; i < bookTitles.length; i++) {
            books[i] = new Book(bookTitles[i]);
        }
    }

    void showBook(){
        for(Book book : books){
            book.display();
        }
    }

}

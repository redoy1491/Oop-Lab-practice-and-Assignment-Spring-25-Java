package redoy;

public class Main {
    public static void main(String[] args) {
        Author a = new Author("Ashraful Islam Redoy","Vovoguore");
        Book b = new Book("Pora Lekha Kori Na",1200,a);
        Libray l = new Libray(50,b);
        AcademicBook ac = new AcademicBook(100,5,b);
        LiteratureBokk li = new LiteratureBokk(200,10,b);
        l.display();
        b.display();
        a.writeBook();
        ac.display();
        li.display();
    }
}
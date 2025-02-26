package Composition2;

public class Main {
    public static void main(String[] args) {
        String[] Booktitle = {"Java Learning","C programming","Python Learning"};
        Library l = new Library(Booktitle);
        System.out.println("Book Title : ");
        l.showBook();


        System.out.println();
        Member m = new Member("Adib");
        LibrarySystem ls = new LibrarySystem(m);
        ls.showMember();
    }
}

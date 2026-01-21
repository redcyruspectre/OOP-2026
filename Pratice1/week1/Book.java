package Pratice1.week1;
public class Book {
    String title ;
    String author;
    String isbn;
    int publicationDate;

    void print() {
        System.out.println("Title " + title);
        System.out.println("Author" + author);
        System.out.println("Isbn" + isbn);
        System.out.println("publicationDate" + publicationDate);
    }
}
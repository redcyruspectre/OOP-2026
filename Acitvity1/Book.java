package Acitvity1;

public class Book {
    String title;
    String author;
    String isbn;
    int publicationDate;

    void print() {
        System.out.println("Title " + title);
        System.out.println("Author" + author);
        System.out.println("Isbn" + isbn);
        System.out.println("publicationDate" + publicationDate);

    }

    Book() {
    }

    public Book(String title1, String author1, String isbn1, int publicationDate1) {
        title = title1;
        author = author1;
        isbn = isbn1;
        publicationDate = publicationDate1;
    }
}

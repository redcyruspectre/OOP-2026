package Acitvity1;

public class Main {
    public static void main(String[] args) {
      Book books1 = new Book();
      // use dot notation to access object's property
      books1.title = "Atomic Habits";
      books1.author = "Book by James Clear";
      books1.isbn = "978-0735211292";
      books1.publicationDate = 10-16-2018 ;
      
      books1.print ();

      Book books2 = new Book();
      books2.title = "Immune: A Journey Into the Mysterious System That Keeps You Alive";
      books2.author = "Book by Philipp Dettmer";
      books2.isbn = "978-0593241318";
      books2.publicationDate = 11-2-2021 ;

      System.out.println();
      books2.print();

      Book books3 = new Book("The Selfish Gene", "Book by Richard Dawkins", "978-0198788607", 1-1-1976);
      books3.print();

      Book books4 = new Book("The Psychology of Money", "Book by Morgan Housel", "978-0857197689", 3-2-2021);
      books4.print();
        
      
      
    }

}

package library;

public class LibraryTest {
    public static void main(String[] args) {
        Library lib = new Library();
        Book myBook = new Book("Java Basics");
        
        lib.lend(myBook);
        lib.returnCopy(myBook);
    }
}
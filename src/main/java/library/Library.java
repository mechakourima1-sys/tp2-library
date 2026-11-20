package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void lend(Book book) {
        System.out.println("Lending book: " + book.getTitle());
    }

    public void returnCopy(Book book) {
        System.out.println("Returning book: " + book.getTitle());
    }
}
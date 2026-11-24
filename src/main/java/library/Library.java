package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void lend(Book book) {
        System.out.println("Lending book: " + book.getTitle());
    }

    public void returnCopy(Book book) {
        System.out.println("Returning book: " + book.getTitle());
    }
   /** Livres dont le titre contient le mot-clé, sans tenir compte de la casse */
public List<Book> searchByTitle(String keyword) {
    String k = keyword.toLowerCase(Locale.ROOT);
    List<Book> result = new ArrayList<>();
    for (Book b : books) {
        if (b.getTitle().toLowerCase(Locale.ROOT).contains(k)) {
            result.add(b);
        }
    }
    return result;
} 
}
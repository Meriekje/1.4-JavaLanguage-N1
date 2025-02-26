package nivell1.exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        library.addBook("Esio Trot");
        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testGetBooks() {
        library.addBook("Tres abuelas y un plan de sabotaje");
        library.addBook("To Kill a Mockingbird");
        ArrayList<String> books = library.getBooks();
        assertNotNull(books);
        assertEquals(2, books.size());
    }

    @Test
    public void testGetBookAt() {
        library.addBook("To Kill a Mockingbird");
        library.addBook("Moby Dick");
        String book = library.getBookAt(0);
        assertEquals("Moby Dick", book);
    }

    @Test
    public void testAddBookAt() {
        library.addBook("The Catcher in the Rye");
        library.addBookAt(1, "Fahrenheit 451");
        assertEquals("Fahrenheit 451", library.getBookAt(0)); // First position after sorting
        assertEquals("The Catcher in the Rye", library.getBookAt(1));
    }

    @Test
    public void testRemoveBookByTitle() {
        library.addBook("Moby Dick");
        boolean removed = library.removeBook("Moby Dick");
        assertTrue(removed);
        assertEquals(0, library.getBooks().size());
    }

}

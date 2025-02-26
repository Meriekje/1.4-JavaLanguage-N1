package nivell1.exercici1;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
    private ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books);
        }
    }

    public ArrayList<String> getBooks() {
        return books;
    }

    public String getBookAt(int index) {
        if (index < 0 || index>=books.size()){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return books.get(index);
    }

    public void addBookAt(int index, String title) {
        if (!books.contains(title)) {
            books.add(index, title);
            Collections.sort(books);
        }
    }

    public boolean removeBook(String title) {
        return books.remove(title);
    }
}

package org.AdrianOraya;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBookCreation() {
        Book book = new Book("Title", "Author", "1234567890");
        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertEquals("1234567890", book.getISBN());
    }

    @Test
    public void testSetters() {
        Book book = new Book("Title", "Author", "1234567890");
        book.setTitle("New Title");
        book.setAuthor("New Author");
        book.setISBN("0987654321");
        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
        assertEquals("0987654321", book.getISBN());
    }
}
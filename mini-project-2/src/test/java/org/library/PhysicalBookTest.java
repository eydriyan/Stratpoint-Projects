package org.library;

import org.junit.Test;
import static org.junit.Assert.*;

public class PhysicalBookTest {

    @Test
    public void testPrintedBookCreation() {
        PhysicalBook book = new PhysicalBook("Title", "Author", "1234567890", 300);
        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertEquals("1234567890", book.getISBN());
        assertEquals(300, book.getNoOfPages());
    }
}
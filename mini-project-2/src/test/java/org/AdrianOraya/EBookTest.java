package org.AdrianOraya;

import org.junit.Test;
import static org.junit.Assert.*;

public class EBookTest {

    @Test
    public void testEBookCreation() {
        EBook book = new EBook("Title", "Author", "1234567890", 1.5);
        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertEquals("1234567890", book.getISBN());
        assertEquals(1.5, book.getFileSize(), 0.001);
    }
}
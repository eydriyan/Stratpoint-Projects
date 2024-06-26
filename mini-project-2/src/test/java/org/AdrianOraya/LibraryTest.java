package org.AdrianOraya;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        Book book1 = new Book("Title1", "Author1", "ISBN1");
        Book book2 = new Book("Title2", "Author2", "ISBN2");

        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.getBooks().size());
        assertEquals(book1, library.getBooks().get(0));
        assertEquals(book2, library.getBooks().get(1));
    }

    @Test
    public void testAddDuplicateBook() {
        Book book = new Book("Title", "Author", "ISBN");
        library.addBook(book);
        library.addBook(book);

        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testRemoveBook() {
        Book book = new Book("Title", "Author", "ISBN");
        library.addBook(book);
        library.removeBook("ISBN");

        assertEquals(0, library.getBooks().size());
    }

    @Test
    public void testRemoveNonExistentBook() {
        library.removeBook("ISBN");
        assertEquals(0, library.getBooks().size());
    }

    @Test
    public void testSearchBookByTitle() {
        Book book = new Book("Title", "Author", "ISBN");
        library.addBook(book);
        assertEquals(book.getTitle(), "Title");
    }

    @Test
    public void testViewAllBooks() {
        Book book1 = new Book("Title1", "Author1", "ISBN1");
        Book book2 = new Book("Title2", "Author2", "ISBN2");

        library.addBook(book1);
        library.addBook(book2);

        library.showAllBooks();
    }
}
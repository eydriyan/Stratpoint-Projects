package org.AdrianOraya;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents a library that implements the ILibrary interface and manages a collection of books.
 */
public class Library implements ILibrary {

    // Create list object
    ArrayList<Book> books = new ArrayList<Book>();

    // Create logger object
    private static final Logger logger = LoggerFactory.getLogger(Library.class);

    // Getter and Setter
    /**
     * Retrieves the collection of books in the library.
     * @return The ArrayList of books.
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * Sets the collection of books in the library.
     * @param books The ArrayList of books to be set.
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    // Method for adding book
    /**
     * Adds a book to the library if it does not already exist.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        for(Book element : books) {
            if(element.getISBN().equals(book.getISBN())) {
                logger.info("The book already exist!");
                System.out.println("The book already exist!");
                return;
            }
        }
        books.add(book);
        logger.info("Book Successfully Added!");
        System.out.println("Book Successfully Added!");
    }

    // Method for removing book
    /**
     * Removes a book from the library using its ISBN.
     * @param ISBN The ISBN of the book to be removed.
     */
    public void removeBook(String ISBN) {
        for(Book book : books) {
            if(book.getISBN().equals(ISBN)) {
                books.remove(book);
                logger.info("Book Successfully Removed!");
                System.out.println("Book Successfully Removed!");
                return;
            }
        }
        logger.info("The book does not exist!");
        System.out.println("The book does not exist!");
    }

    // Method for searching book
    /**
     * Searches for a book in the library by its title.
     * @param bookTitle The title of the book to search for.
     */
    public void searchBook(String bookTitle) {
        for(Book book : books) {
            if (book.getTitle().equals(bookTitle)){
                logger.info("Book Found: You searched " + bookTitle);
                System.out.println("Book Found!");
                book.displayInformation();
                return;
            }
        }
        logger.info("Book not Found: You searched " + bookTitle);
        System.out.println("Book not Found!");
    }

    // Method to show all books
    /**
     * Displays information for all books currently in the library.
     * Checks if the library is empty before displaying.
     */
    public void showAllBooks() {
        if(!books.isEmpty()) {
            for (Book book : books){
                book.displayInformation();
            }
        }else {
            System.out.println("\nThe library is empty. Please add some books!");
        }
    }
}

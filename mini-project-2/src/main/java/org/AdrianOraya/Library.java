package org.AdrianOraya;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Library {

    ArrayList<Book> books = new ArrayList<Book>();
    private static final Logger logger = LoggerFactory.getLogger(Library.class);

    // Getter and Setter
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    // Method for adding book
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

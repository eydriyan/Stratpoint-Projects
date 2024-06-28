package org.AdrianOraya;

/**
 * Represents a book with basic attributes such as title, author, and ISBN.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    /**
     * Constructs a Book object with given title, author, and ISBN.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN (International Standard Book Number) of the book.
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters and Setters
    /**
     * Retrieves the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     * @param title The title to be set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the author of the book.
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     * @param author The author to be set.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Retrieves the ISBN of the book.
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN of the book.
     * @param ISBN The ISBN to be set.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    //Method to display book information
    /**
     * Displays the information of the book, including title, author, and ISBN.
     */
    public void displayInformation() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

package org.AdrianOraya;

/**
 * Defines operations that a library can perform such as adding, removing, searching, and displaying books.
 */
public interface ILibrary {

    /**
     * Adds a book to the library.
     * @param book The book to be added.
     */
    public void addBook(Book book);

    /**
     * Removes a book from the library using its ISBN.
     * @param ISBN The ISBN of the book to be removed.
     */
    public void removeBook(String ISBN);

    /**
     * Searches for a book in the library by its title.
     * @param bookTitle The title of the book to search for.
     */
    public void searchBook(String bookTitle);

    /**
     * Displays information for all books currently in the library.
     */
    public void showAllBooks();
}

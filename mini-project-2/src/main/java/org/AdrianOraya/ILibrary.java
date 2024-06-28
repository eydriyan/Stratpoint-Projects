package org.AdrianOraya;

public interface ILibrary {

    public void addBook(Book book);

    public void removeBook(String ISBN);

    public void searchBook(String bookTitle);

    public void showAllBooks();
}

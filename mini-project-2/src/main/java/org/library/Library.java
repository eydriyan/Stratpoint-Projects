package org.library;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<Book>();

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
                System.out.println("The book already exist!");
                return;
            }
        }
        books.add(book);
        System.out.println("Book Successfully Added!");
    }

    // Method for removing book
    public void removeBook(String ISBN) {
        for(Book book : books) {
            if(book.getISBN().equals(ISBN)) {
                books.remove(book);
                System.out.println("Book Successfully Removed!");
                return;
            }
        }
        System.out.println("The book does not exist!");
    }

    // Method for searching book
    public void searchBook(String bookTitle) {
        for(Book book : books) {
            if (book.getTitle().equals(bookTitle)){
                System.out.println("Book Found!");
                book.displayInformation();
                return;
            }
        }
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

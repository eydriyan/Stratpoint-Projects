package org.library;

public class PhysicalBook extends Book {
    private int noOfPages;

    // Constructor
    public PhysicalBook(String title, String author, String ISBN, int noOfPages) {
        super(title, author, ISBN);
        this.noOfPages = noOfPages;
    }

    // Getter and Setter
    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    // Override parent method to display book information
    @Override
    public void displayInformation() {
        System.out.println("\nType: Physical Book");
        super.displayInformation();
        System.out.println("No. of Pages: " + noOfPages);
    }
}

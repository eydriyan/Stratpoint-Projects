package org.AdrianOraya;

/**
 * Represents a physical book that extends the Book class and includes the number of pages attribute.
 */
public class PhysicalBook extends Book {
    private int noOfPages;

    // Constructor
    /**
     * Constructs a PhysicalBook object with given title, author, ISBN, and number of pages.
     * @param title The title of the PhysicalBook.
     * @param author The author of the PhysicalBook.
     * @param ISBN The ISBN of the PhysicalBook.
     * @param noOfPages The number of pages in the PhysicalBook.
     */
    public PhysicalBook(String title, String author, String ISBN, int noOfPages) {
        super(title, author, ISBN);
        this.noOfPages = noOfPages;
    }

    // Getter and Setter
    /**
     * Retrieves the number of pages in the PhysicalBook.
     * @return The number of pages in the PhysicalBook.
     */
    public int getNoOfPages() {
        return noOfPages;
    }

    /**
     * Sets the number of pages in the PhysicalBook.
     * @param noOfPages The number of pages to be set.
     */
    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    // Override parent method to display book information
    /**
     * Overrides the displayInformation method of the parent class to include number of pages information.
     */
    @Override
    public void displayInformation() {
        System.out.println("\nType: Physical Book");
        super.displayInformation();
        System.out.println("No. of Pages: " + noOfPages);
    }
}

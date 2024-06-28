package org.AdrianOraya;

/**
 * Represents an EBook that extends the Book class and includes a file size attribute.
 */
public class EBook extends Book{
    private double fileSize;

    // Constructor
    /**
     * Constructs an EBook object with given title, author, ISBN, and file size.
     * @param title The title of the EBook.
     * @param author The author of the EBook.
     * @param ISBN The ISBN of the EBook.
     * @param fileSize The file size of the EBook.
     */
    public EBook(String title, String author, String ISBN, double fileSize) {
        super(title, author, ISBN);
        this.fileSize = fileSize;
    }

    // Getter and Setter
    /**
     * Retrieves the file size of the EBook.
     * @return The file size of the EBook in megabytes (MB).
     */
    public double getFileSize() {
        return fileSize;
    }

    /**
     * Sets the file size of the EBook.
     * @param fileSize The file size to be set in megabytes (MB).
     */
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // Override parent method to display book information
    /**
     * Overrides the displayInformation method of the parent class to include file size information.
     */
    @Override
    public void displayInformation() {
        System.out.println("\nType: EBook");
        super.displayInformation();
        System.out.println("File Size: " + fileSize);
    }
}
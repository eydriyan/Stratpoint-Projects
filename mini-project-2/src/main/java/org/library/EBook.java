package org.library;

public class EBook extends Book{
    private double fileSize;

    // Constructor
    public EBook(String title, String author, String ISBN, double fileSize) {
        super(title, author, ISBN);
        this.fileSize = fileSize;
    }

    // Getter and Setter
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // Override parent method to display book information
    @Override
    public void displayInformation() {
        System.out.println("\nType: EBook");
        super.displayInformation();
        System.out.println("File Size: " + fileSize);
    }
}
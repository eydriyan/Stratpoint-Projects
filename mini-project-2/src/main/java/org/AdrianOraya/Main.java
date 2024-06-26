package org.AdrianOraya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scan = new Scanner(System.in);

        // Create a Library object
        Library library = new Library();

        while(true) {
            // Prompt user to select an operation
            System.out.println("\n-------------------------------------------------");
            System.out.println("\t\t\tLibrary Management System");
            System.out.println("-------------------------------------------------");
            System.out.println("\t\t\t\tSelect an Option");
            System.out.println("[0]Exit");
            System.out.println("[1]Add Physical Book");
            System.out.println("[2]Add EBook");
            System.out.println("[3]Remove Book");
            System.out.println("[4]Search Book by Title");
            System.out.println("[5]List ALl Books");
            System.out.println("-------------------------------------------------");
            System.out.print("Enter choice: ");

            // Read the selected choice from the user
            String choice = scan.next();
            // Consume new line left-over
            scan.nextLine();
            System.out.println("-------------------------------------------------");

            // Check if user wants to exit
            if(choice.equals("0")) {
                logger.info("Exit Success");
                System.out.println("Exited.");
                break;
            }

            try{
                // Perform operation based on user input
                switch(choice) {
                    case "1":
                        System.out.println("\t\t\t\t\tADD A PHYSICAL BOOK");
                        System.out.print("Enter title: ");
                        String physicalBookTitle = scan.nextLine();
                        System.out.print("Enter Author: ");
                        String physicalBookAuthor = scan.nextLine();
                        System.out.print("Enter ISBN: ");
                        String physicalBookISBN = scan.nextLine();
                        System.out.print("Enter number of pages: ");
                        int noOfPages = scan.nextInt();
                        library.addBook(new PhysicalBook(physicalBookTitle, physicalBookAuthor, physicalBookISBN, noOfPages));
                        break;
                    case "2":
                        System.out.println("\t\t\t\t\tADD AN EBOOK");
                        System.out.print("Enter title: ");
                        String EBookTitle = scan.nextLine();
                        System.out.print("Enter Author: ");
                        String EBookAuthor = scan.nextLine();
                        System.out.print("Enter ISBN: ");
                        String EBookISBN = scan.nextLine();
                        System.out.print("Enter file size: ");
                        double fileSize = scan.nextDouble();
                        library.addBook(new EBook(EBookTitle, EBookAuthor, EBookISBN, fileSize));
                        break;
                    case "3":
                        System.out.println("\t\t\t\t\tREMOVE A BOOK");
                        System.out.print("Enter ISBN: ");
                        String isbnToRemove = scan.nextLine();
                        library.removeBook(isbnToRemove);
                        break;
                    case "4":
                        System.out.println("\t\t\t\t\tSEARCH A BOOK");
                        System.out.print("Enter title: ");
                        String titleToSearch = scan.nextLine();
                        library.searchBook(titleToSearch);
                        break;
                    case "5":
                        System.out.println("\t\t\t\t\tLIST OF ALL BOOKS");
                        library.showAllBooks();
                        break;
                    default:
                        logger.info("Invalid Choice");
                        System.out.println("Invalid choice. Try again.");
                        System.out.println("-------------------------------------------------");
                }
                // Handle invalid input
            }catch (Exception ex){
                logger.info("Invalid Input");
                System.out.println("=================================================");
                System.out.println("Invalid input. Please try again.");
                System.out.println("=================================================");
                // Clear invalid input from scanner
                scan.next();
            }
        }
        // Close the scanner
        scan.close();
    }
}
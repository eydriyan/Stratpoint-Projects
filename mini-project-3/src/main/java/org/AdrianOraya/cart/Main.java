package org.AdrianOraya.cart;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        // Create scanner object
        Scanner scan = new Scanner(System.in);

        // Create cart object
        Cart cart = new Cart();

        // Create products
        Product[] products = {
                new Product(1, "Laptop", 999.99, "Electronics"),
                new Product(2, "Smartphone", 499.99, "Electronics"),
                new Product(3, "Headphones", 149.99, "Accessories"),
                new Product(4, "Monitor", 199.99, "Electronics"),
                new Product(5, "Mouse", 29.99, "Accessories")
        };

        while(true) {
            // Prompt user to select an action
            System.out.println("\n-------------------------------------------------");
            System.out.println("\t\t\tE-commerce Cart System");
            System.out.println("-------------------------------------------------");
            System.out.println("\t\t\t\tSelect an Option");
            System.out.println("[0] Exit");
            System.out.println("[1] View Products");
            System.out.println("[2] Add Product to Cart");
            System.out.println("[3] View Cart");
            System.out.println("[4] Calculate Total Price");
            System.out.println("-------------------------------------------------");
            System.out.print("Enter choice: ");

            // Read the selected choice from the user
            String choice = scan.next();
            // Consume new line left-over
            scan.nextLine();
            System.out.println("-------------------------------------------------");

            // Check if user wants to exit
            if(choice.equals("0")) {
                System.out.println("Exited.");
                logger.info("Exit Success");
                break;
            }

            try{
                // Perform operation based on user input
                switch(choice) {
                    case "1":
                        System.out.println("\t\t\t\t\tAVAILABLE PRODUCTS");
                        Arrays.stream(products).forEach(product -> System.out.println(product));
                        logger.info("Viewed available products.");
                        break;
                    case "2":
                        System.out.println("\t\t\t\t\tADD PRODUCT TO CART");
                        System.out.print("Enter product id: ");
                        int productId = scan.nextInt();
                        Optional<Product> selectedProduct = Arrays.stream(products)
                                .filter(product -> product.getId() == productId)
                                .findFirst();

                        if (selectedProduct.isPresent()) {
                            System.out.print("Enter quantity: ");
                            int quantity = scan.nextInt();
                            if (quantity > 0) {
                                cart.addToCart(new Product(selectedProduct.get().getId(), selectedProduct.get().getName(), selectedProduct.get().getPrice(), quantity, selectedProduct.get().getCategory()));
                            } else {
                                System.out.println("Invalid quantity.");
                                logger.info("Entered an Invalid quantity");
                            }
                        } else {
                            System.out.println("Product does not exist.");
                            logger.info("The product ID entered does not exist");
                        }
                        break;
                    case "3":
                        System.out.println("\t\t\t\t\tCART ITEMS");
                        cart.viewCart();
                        break;
                    case "4":
                        System.out.println("\t\t\t\t\tTOTAL PRICE OF ITEMS");
                        System.out.printf("Total Price: %.2f\n", cart.totalPrice());
                        logger.info("Viewed the total price of items");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        logger.info("Entered an invalid choice");
                        System.out.println("-------------------------------------------------");
                }
            // Handle invalid input
            }catch (Exception ex){
                System.out.println("-------------------------------------------------");
                System.out.println("Invalid input. Please try again.");
                logger.info("Entered an invalid input");
                System.out.println("-------------------------------------------------");
                // Clear invalid input from scanner
                scan.next();
            }
        }
        // Close the scanner
        scan.close();
    }
}
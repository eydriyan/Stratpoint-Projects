package org.AdrianOraya.cart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Represents a shopping cart that can hold products.
 */
public class Cart implements ICart {

    // Create list object
    ArrayList<Product> products = new ArrayList<Product>();

    // Create logger object
    private static final Logger logger = LoggerFactory.getLogger(Cart.class);

    /**
     * Adds a product to the cart. If the product already exists in the cart, its quantity is updated.
     *
     * @param product The product to add to the cart.
     */
    public void addToCart(Product product) {
        Optional<Product> existingProduct = products.stream()
                .filter(p -> p.getId() == product.getId())
                .findFirst();

        if (existingProduct.isPresent()) {
            existingProduct.get().setQuantity(existingProduct.get().getQuantity() + product.getQuantity());
        } else {
            products.add(product);
        }
        System.out.println(product.getName() + " Successfully added to cart!");
        logger.info(product.getName() + " Successfully added to cart!");
    }

    /**
     * Calculates the total price of all products in the cart.
     *
     * @return The total price of all products in the cart.
     */
    public double totalPrice() {
        return products.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();
    }

    /**
     * Displays all products currently in the cart.
     */
    public void viewCart() {
        if(!products.isEmpty()) {
            System.out.printf("%-5s %-15s %-10s %-10s %-15s%n", "ID", "Name", "Price", "Quantity", "Category");
            products.forEach(product -> System.out.printf("%-5d %-15s %-10.2f %-10d %-15s%n", product.getId(), product.getName(), product.getPrice(), product.getQuantity(), product.getCategory()));
            logger.info("Viewed cart items");
        }else {
            System.out.println("The cart is empty.");
            logger.info("The cart is empty");
        }
    }
}
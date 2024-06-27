package org.AdrianOraya.cart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Optional;

public class Cart {

    // Create list object
    ArrayList<Product> products = new ArrayList<Product>();
    private static final Logger logger = LoggerFactory.getLogger(Cart.class);

    // Method to add product to cart
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

    // Method to calculate the total price
    public double totalPrice() {
        return products.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();
    }

    // Method to view all products in cart
    public void viewCart() {
        if(!products.isEmpty()) {
            products.forEach(product -> System.out.println(product));
            logger.info("Viewed cart items");
        }else {
            System.out.println("The cart is empty.");
            logger.info("The cart is empty");
        }
    }
}
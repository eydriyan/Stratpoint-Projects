package org.AdrianOraya.cart;

import java.util.ArrayList;
import java.util.Optional;

public class Cart {

    // Create list object
    ArrayList<Product> products = new ArrayList<Product>();

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
        }else {
            System.out.println("The cart is empty.");
        }
    }
}
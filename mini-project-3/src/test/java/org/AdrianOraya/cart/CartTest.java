package org.AdrianOraya.cart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartTest {

    private Cart cart;
    private Product laptop;
    private Product smartphone;

    @BeforeEach
    public void setUp() {
        cart = new Cart();
        laptop = new Product(1, "Laptop", 999.99, 1, "Electronics");
        smartphone = new Product(2, "Smartphone", 499.99, 1, "Electronics");
    }

    @Test
    public void testAddToCart() {
        cart.addToCart(laptop);
        cart.addToCart(smartphone);
        assertEquals(2, cart.products.size());
        assertEquals(laptop, cart.products.get(0));
        assertEquals(smartphone, cart.products.get(1));
    }

    @Test
    public void testAddToCart_ExistingProduct() {
        cart.addToCart(laptop);
        cart.addToCart(new Product(1, "Laptop", 999.99, 1, "Electronics"));
        assertEquals(1, cart.products.size());
        assertEquals(2, cart.products.get(0).getQuantity());
    }

    @Test
    public void testTotalPrice() {
        cart.addToCart(laptop);
        cart.addToCart(smartphone);
        double expectedTotal = laptop.getPrice() * laptop.getQuantity() + smartphone.getPrice() * smartphone.getQuantity();
        assertEquals(expectedTotal, cart.totalPrice());
    }

    @Test
    public void testViewCart() {
        cart.addToCart(laptop);
        cart.addToCart(smartphone);
        cart.viewCart();
    }
}

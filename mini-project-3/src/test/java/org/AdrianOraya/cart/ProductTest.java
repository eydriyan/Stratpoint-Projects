package org.AdrianOraya.cart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testProductCreation() {
        Product product = new Product(1, "Laptop", 999.99, 5, "Electronics");
        assertEquals(1, product.getId());
        assertEquals("Laptop", product.getName());
        assertEquals(999.99, product.getPrice());
        assertEquals(5, product.getQuantity());
        assertEquals("Electronics", product.getCategory());
    }

    @Test
    public void testSetters() {
        Product product = new Product(1, "Laptop", 999.99, 5, "Electronics");
        product.setId(2);
        product.setName("Smartphone");
        product.setPrice(499.99);
        product.setQuantity(3);
        product.setCategory("Accessories");

        assertEquals(2, product.getId());
        assertEquals("Smartphone", product.getName());
        assertEquals(499.99, product.getPrice());
        assertEquals(3, product.getQuantity());
        assertEquals("Accessories", product.getCategory());
    }

    @Test
    public void testToString() {
        Product product = new Product(1, "Laptop", 999.99, 5, "Electronics");
        String expected = "ID: 1, Name: Laptop, Price: 999.99, Quantity: 5, Category: Electronics";
        assertEquals(expected, product.toString());
    }

    @Test
    public void testDisplayInformation() {
        Product laptop = new Product(1, "Laptop", 999.99, "Electronics");
        Product smartphone = new  Product(2, "Smartphone", 499.99, "Electronics");
        laptop.displayInformation();
        smartphone.displayInformation();
    }
}
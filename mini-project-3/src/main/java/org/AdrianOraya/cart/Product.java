package org.AdrianOraya.cart;

public class Product {
    // Product Attributes
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String category;

    // Product Constructors
    public Product(int id, String name, double price, int quantity, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getter and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Display product information
    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Price: %.2f, Quantity: %d, Category: %s", id, name, price, quantity, category);
    }

    // Display information of product choices
    public void displayInformation() {
        System.out.printf("ID: %d, Name: %s, Price: %.2f, Category: %s%n", id, name, price, category);
    }

}

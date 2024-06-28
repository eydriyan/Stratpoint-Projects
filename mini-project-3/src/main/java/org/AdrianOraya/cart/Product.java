package org.AdrianOraya.cart;

/**
 * Represents a product with basic attributes such as id, name, price, quantity, and category.
 */
public class Product {
    // Product Attributes
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String category;

    /**
     * Constructs a product with specified id, name, price, quantity, and category.
     *
     * @param id       The unique identifier of the product.
     * @param name     The name of the product.
     * @param price    The price of the product.
     * @param quantity The quantity of the product.
     * @param category The category of the product.
     */
    public Product(int id, String name, double price, int quantity, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    /**
     * Constructs a product with specified id, name, price, and category.
     *
     * @param id       The unique identifier of the product.
     * @param name     The name of the product.
     * @param price    The price of the product.
     * @param category The category of the product.
     */
    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    /**
     * Retrieves the id of the product.
     *
     * @return The id of the product.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the product.
     *
     * @param id The id to set for the product.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the product.
     *
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name The name to set for the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price The price to set for the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Retrieves the quantity of the product.
     *
     * @return The quantity of the product.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product.
     *
     * @param quantity The quantity to set for the product.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Retrieves the category of the product.
     *
     * @return The category of the product.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the product.
     *
     * @param category The category to set for the product.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Returns a string representation of the product including id, name, price, quantity, and category.
     *
     * @return A string representation of the product.
     */
    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Price: %.2f, Quantity: %d, Category: %s", id, name, price, quantity, category);
    }

    /**
     * Displays brief information about the product to be displayed as choices including id, name, price, and category.
     */
    public void displayInformation() {
        System.out.printf("ID: %d, Name: %s, Price: %.2f, Category: %s%n", id, name, price, category);
    }

}

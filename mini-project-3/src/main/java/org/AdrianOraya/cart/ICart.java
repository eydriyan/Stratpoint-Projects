package org.AdrianOraya.cart;

/**
 * Defines operations that a library can perform such as adding, removing, searching, and displaying books.
 */
public interface ICart {

    /**
     * Adds a product to the shopping cart.
     * @param product The product to be added to the cart.
     */
    public void addToCart(Product product);

    /**
     * Calculates and returns the total price of all products in the cart.
     * @return The total price of all products in the cart.
     */
    public double totalPrice();

    /**
     * Displays the contents of the shopping cart.
     */
    public void viewCart();
}

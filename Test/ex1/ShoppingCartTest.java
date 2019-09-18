package ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    public void newCartShouldHaveZero(){

        ShoppingCart cart = new ShoppingCart();
        int result = cart.getItemCount();

        assertEquals(0, result);
    }

    @Test
    public void emptyShouldRemoveAllItems(){
        //Makes a shoppingcart
        ShoppingCart cart = new ShoppingCart();
        //Add an item. The item is "Test" and it adds one to the cart.
        cart.addItem(new Product("Test", 1.0));
        //Empties the cart
        cart.empty();
        //Now we expect that there's no items in cart and the result should be cart.getItemsCount
        assertEquals(0, cart.getItemCount());

    }

   /*________________________________________________*/

    @Test
    void getBalance() {
        
    }

    @Test
    void addItem() {
    }

    @Test
    void removeItem() {
    }

    @Test
    void getItemCount() {
    }

    @Test
    void empty() {

    }
}
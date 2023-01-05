package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new dvd objects and add them to the cart
        Media dvd1 = new DigitalVideoDisc("The Lion King", 
        		"Animation", 19.95f, "Roger Allers", 87);
        cart.addMedia(dvd1);

        Media dvd2 = new DigitalVideoDisc("Star Wars", 
        		"Science Fiction", 24.95f, "Geogre Lucas", 87);
        cart.addMedia(dvd2);

        Media dvd3 = new DigitalVideoDisc("Aladin", 
        		"Animation", 18.99f);
        cart.addMedia(dvd3);

//        // Test the print method
//        cart.print();
//        // To-do: Test the search method here
//        cart.searchByID(1);
//        cart.searchByID(4);
//
//        cart.searchByTitle("Aladin");
//        cart.searchByTitle("Lion");
    }
}
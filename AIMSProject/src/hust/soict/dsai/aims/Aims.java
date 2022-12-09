package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import java.util.Scanner;
//import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.*;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void main(String[] args) {
        int choice_showMenu = -1;
        int choice_storeMenu = -1;
        int choice_mediaDetailsMenu = -1;
        int choice_cartMenu = -1;
        Scanner sc = new Scanner(System.in);
        do {
            showMenu();
            System.out.print("Enter your choice: ");
            choice_showMenu = sc.nextInt();
            if(choice_showMenu == 1){
                do {
                    storeMenu();
                    System.out.print("Enter your choice: ");
                    choice_storeMenu = sc.nextInt();
                    if(choice_storeMenu == 1){
                        do{
                            mediaDetailsMenu();
                            System.out.print("Enter your choice: ");
                            choice_mediaDetailsMenu = sc.nextInt();
                            if(choice_mediaDetailsMenu == 1);
                            else if (choice_mediaDetailsMenu == 2); // play
                            else{
                                if (choice_mediaDetailsMenu != 0) System.out.println("Invalid choice");
                            }
                        } while (choice_mediaDetailsMenu != 0);
                    }
                    else if (choice_storeMenu == 2); // Add a media to cart
                    else if (choice_storeMenu == 3); // Play a media
                    else if (choice_storeMenu == 4); // See current cart (same choice_storeMenu 3)
                    else{
                        if(choice_storeMenu != 0) System.out.println("Invalid choice");
                    }
                } while(choice_storeMenu != 0);
            }
            else if(choice_showMenu == 2); // Update store: allow add or remove media from store
            else if(choice_showMenu == 3); // See current cart: allow sort by title or cost
            else{
                if(choice_showMenu != 0) System.out.println("Invalid choice");
            }
        } while(choice_showMenu != 0);



//        Cart anOrder = new Cart();
//
//
//        Media dvd1 = new DigitalVideoDisc("The Lion King",
//                "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addMedia(dvd1);
//
//        Media dvd2 = new DigitalVideoDisc("Star Wars",
//                "Science Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addMedia(dvd2);
//
//        Media dvd3 = new DigitalVideoDisc("Aladin",
//                "Animation", 18.99f);
//        anOrder.addMedia(dvd3);
//
//
//        System.out.println("Total Cost is: " + anOrder.totalCost());
//
//
//        anOrder.removeMedia(dvd2);
    }
}

package hust.soict.dsai.aims;
import java.util.Scanner;


import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    public static Scanner sc = new Scanner(System.in);

    public static Store store = new Store();
    public static Cart cart = new Cart();

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

    public static Media readAndCheckValidMedia() {
        System.out.print("Enter the title of the media: ");
        Media m = cart.searchByTitle(sc.nextLine());
        if (m == null) {
            System.out.println("Item not found");
            return null;
        }
        return m;
    }

    public static void playMedia(Media m) {
        if (m instanceof CompactDisc) {
            CompactDisc cd = (CompactDisc) m;
            cd.play();
        } else if (m instanceof DigitalVideoDisc) {
            DigitalVideoDisc dvd = (DigitalVideoDisc) m;
            dvd.play();
        } else {
            System.out.println("Can not play this media.");
        }
    }

    public static void updateStoreRemove() {
        Media m = readAndCheckValidMedia();
        if (m != null) {
            store.removeMedia(m);
        }
    }

    public static void updateStoreAdd() {
        System.out.println("What do you want to add ?");
        System.out.println("1. Book");
        System.out.println("2. Compact disc");
        System.out.println("3. Digital video disc");
        System.out.println("Enter your choice: ");
        Media m = null;
        if (sc.nextInt() == 1) {
            System.out.print("Enter the title: ");
            String title = sc.nextLine();
            System.out.print("Enter the category: ");
            String category = sc.nextLine();
            System.out.print("Enter the cost: ");
            float cost = sc.nextFloat();
            m = new Book(title, category, cost);
        } else if (sc.nextInt() == 2) {
            System.out.print("Enter the title: ");
            String title = sc.nextLine();
            System.out.print("Enter the category: ");
            String category = sc.nextLine();
            System.out.print("Enter the cost: ");
            float cost = sc.nextFloat();
            System.out.print("Enter the director: ");
            String director = sc.nextLine();
            System.out.print("Enter the length: ");
            int length = sc.nextInt();
            System.out.print("Enter the artist: ");
            String artist = sc.nextLine();
            m = new CompactDisc(title, category, cost, director, length, artist);
        } else if (sc.nextInt() == 3) {
            System.out.print("Enter the title: ");
            String title = sc.nextLine();
            System.out.print("Enter the category: ");
            String category = sc.nextLine();
            System.out.print("Enter the cost: ");
            float cost = sc.nextFloat();
            System.out.print("Enter the director: ");
            String director = sc.nextLine();
            System.out.print("Enter the length: ");
            int length = sc.nextInt();
            m = new DigitalVideoDisc(title, category, cost, director, length);
        }
        store.addMedia(m);
    }

    public static void viewStore() {
        int choice_storeMenu;
        do {
            storeMenu();
            System.out.print("Enter your choice: ");
            choice_storeMenu = sc.nextInt();
            if (choice_storeMenu == 1) {
                seeMediaDetail();
            } else if (choice_storeMenu == 2) { // Add a media to cart
                // Enter the title of the media
                sc.nextLine(); // Skip \n previous sc.nextInt()
                Media m = readAndCheckValidMedia();
                if (m != null) {
                    // After adding a Media to cart, the system will display the number of Medias
                    // in the current cart.
                    cart.addMedia(m);
                    System.out.println("Number of medias in cart: " + cart.getNumberOrdered());
                }
            } else if (choice_storeMenu == 3) { // Play a media
                // Enter the title of the media
                // Check the validity of the title
                sc.nextLine(); // Skip \n previous sc.nextInt()
                Media m = readAndCheckValidMedia();
                if (m != null) {
                    playMedia(m);
                }
            } else if (choice_storeMenu == 4) { // See current cart (same choice_showMenu 3)
                seeCurrentCart();
            } else {
                if (choice_storeMenu != 0) System.out.println("Invalid choice");
            }
        } while (choice_storeMenu != 0);
    }

    public static void seeMediaDetail() {
        int choice_mediaDetailsMenu;
        do {
            sc.nextLine(); // Skip \n previous sc.nextInt()
            Media m = readAndCheckValidMedia();
            if (m == null) break;
            mediaDetailsMenu();
            System.out.print("Enter your choice: ");
            choice_mediaDetailsMenu = sc.nextInt();
            if (choice_mediaDetailsMenu == 1) {
                cart.addMedia(m);
            } else if (choice_mediaDetailsMenu == 2) {
                playMedia(m);
            } else {
                if (choice_mediaDetailsMenu != 0) System.out.println("Invalid choice");
            }
        } while (choice_mediaDetailsMenu != 0);
    }

    public static void seeCurrentCart() {
        int choice_cartMenu;
        do {
            cartMenu();
            System.out.print("Enter your choice: ");
            choice_cartMenu = sc.nextInt();

            if (choice_cartMenu == 1) { // Filter id or title
                System.out.println("1. Filter by id");
                System.out.println("2. Filter by title");
                System.out.print("Enter your choice: ");
                if (sc.nextInt() == 1) {
                    cart.filterById(sc.nextInt());
                } else if (sc.nextInt() == 2) {
                    cart.filterByTitle(sc.nextLine());
                } else {
                    System.out.println("Invalid value!");
                }
            } else if (choice_cartMenu == 2) { // Sort id or title
                System.out.println("1. Sort by title");
                System.out.println("2. Sort by cost");
                System.out.print("Enter your choice: ");
                if (sc.nextInt() == 1) {
                    cart.sortByTitle();
                } else if (sc.nextInt() == 2) {
                    cart.sortByCost();
                } else {
                    System.out.println("Invalid value!");
                }
            } else if (choice_cartMenu == 3) { // Remove
                System.out.print("Enter the title of media: ");
                Media m = cart.searchByTitle(sc.next()); // Bổ sung tìm kiếm ở đây, có thể là id hoặc title
                cart.removeMedia(m);
            } else if (choice_cartMenu == 4) { // Play
                sc.nextLine(); // Skip \n previous sc.nextInt()
                Media m = readAndCheckValidMedia();
                if (m != null) {
                    playMedia(m);
                }
            } else if (choice_cartMenu == 5) { // Place order
                System.out.println("An order is created");
                cart.removeAllItem();
            } else {
                if (choice_cartMenu != 0) System.out.println("Invalid choice");
            }
        } while (choice_cartMenu != 0);
    }


    public static void main(String[] args) {
        int choice_showMenu;
        do {
            showMenu();
            System.out.print("Enter your choice: ");
            choice_showMenu = sc.nextInt();
            if (choice_showMenu == 1) {
                viewStore();
            } else if (choice_showMenu == 2) { // Update store: allow add or remove media from store
                System.out.println("You want add or remove ?");
                System.out.println("1. Add");
                System.out.println("2. Remove");
                if (sc.nextInt() == 1) updateStoreAdd();
                else if (sc.nextInt() == 2) updateStoreRemove();
                else {
                    System.out.println("Invalid value!");
                }
            } else if (choice_showMenu == 3) {
                // See current cart: allow sort by title or cost
                seeCurrentCart();
            } else {
                if (choice_showMenu != 0) System.out.println("Invalid choice");
            }
        } while (choice_showMenu != 0);
    }     
//Bai cu:
//        Cart anOrder = new Cart();
//
//
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
//                "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
//                "Science Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addDigitalVideoDisc(dvd2);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
//                "Animation", 18.99f);
//        anOrder.addDigitalVideoDisc(dvd3);
//
//
//        System.out.println("Total Cost is: " + anOrder.totalCost());
//
//
//        anOrder.removeDigitalVideoDisc(dvd2);
//        anOrder.print();
//    }
}
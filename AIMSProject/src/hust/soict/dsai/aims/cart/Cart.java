package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    public final static int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemOrdered = new ArrayList<>();
    public void addMedia(Media m){
        if(itemOrdered.size() <= MAX_NUMBERS_ORDERED && !itemOrdered.contains(m)){
            itemOrdered.add(m);
            System.out.println("The media has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public void removeMedia(Media m){
        itemOrdered.remove(m);
        System.out.println(m.getTitle() + "has been deleted");
    }
    public float totalCost() {
        float sum = 0f;
        for (Media m : itemOrdered) {
            sum += m.getCost();
        }
        return sum;
    }

//    public void print() {
//        System.out.println("***********************CART***********************");
//        for (int i = 0; i < qtyOrdered; i++) {
//            System.out.println(itemsOrdered[i].toString());
//        }
//        System.out.println("**************************************************");
//    }
//
//    public DigitalVideoDisc searchByID(int number) {
//        for (int i = 0; i < qtyOrdered; i++) {
//            if (itemsOrdered[i].getId() == number) {
//                System.out.println("Found: " + itemsOrdered[i].toString());
//                return itemsOrdered[i];
//            }
//        }
//        System.out.println("Item not found.");
//        return null;
//    }
//
//    public DigitalVideoDisc searchByTitle(String keyword) {
//        for (int i = 0; i < qtyOrdered; i++) {
//            if (itemsOrdered[i].isMatch(keyword)) {
//                System.out.println("Found: " + itemsOrdered[i].toString());
//                return itemsOrdered[i];
//            }
//        }
//        System.out.println("Item not found.");
//        return null;
//    }
}

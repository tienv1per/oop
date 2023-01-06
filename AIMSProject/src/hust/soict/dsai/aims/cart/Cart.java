package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public final static int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public void addMedia(Media m){
        if(itemsOrdered.size() <= MAX_NUMBERS_ORDERED && !itemsOrdered.contains(m)){
            itemsOrdered.add(m);
            System.out.println("The media has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public void removeMedia(Media m){
        itemsOrdered.remove(m);
        System.out.println(m.getTitle() + "has been deleted");
    }
    public float totalCost() {
        float sum = 0f;
        for (Media m : itemsOrdered) {
            sum += m.getCost();
        }
        return sum;
    }
    public int getNumberOrdered() {
        return itemsOrdered.size();
    }

    public ObservableList<Media> getItemOrdered() {
        return itemsOrdered;
    }   
    public Media searchByTitle(String title) {
        for (Media m : itemsOrdered) {
            if (m.getTitle().equals(title)) return m;
        }
        return null;
    }

    public void filterByTitle(String title) {
        for (Media m : itemsOrdered) {
            if (m.getTitle().contains(title)) {
                System.out.println(m.toString());
            }
        }
    }

    public void filterById(int id) {
        for (Media m : itemsOrdered) {
            if (m.getId() == id) {
                System.out.println(m.toString());
            }
        }
    }

    public void sortByTitle() {
        itemsOrdered.sort(new MediaComparatorByTitleCost());

    }

    public void sortByCost() {
        itemsOrdered.sort(new MediaComparatorByCostTitle());
    }

    public void removeAllItem() {
        itemsOrdered.clear();
    }
    
       
    
    
    
// Bai cu:    
//    private int qtyOrdered;
//    private DigitalVideoDisc itemsOrdered[] =
//            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
//    public void addDigitalVideoDisc(DigitalVideoDisc disc){
//    	if(qtyOrdered < MAX_NUMBERS_ORDERED)
//		{
//			itemsOrdered[qtyOrdered] = disc;
//			qtyOrdered++;
//			System.out.printf("The disc " + disc.getTitle() + " has been added\n");
//		}
//		else {
//			System.out.printf("The cart is almost full\n");
//		}
//    }
//// New method 1 adding a list of DVDs to the current cart
//    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
//        for(DigitalVideoDisc disc: dvdList){
//            if(qtyOrdered <= MAX_NUMBERS_ORDERED){
//                itemsOrdered[qtyOrdered] = disc;
//                qtyOrdered++;
//                System.out.println("The disc has been added");
//            }
//            else{
//                System.out.println("The cart is almost full");
//                break;
//            }
//        }
//    }
//// New method 2 for passing an arbitrary number of arguments for dvd
////    public void addDigitalVideoDisc(DigitalVideoDisc ...dvdList){
////        for(DigitalVideoDisc disc: dvdList){
////            if(qtyOrdered <= MAX_NUMBERS_ORDERED){
////                itemsOrdered[qtyOrdered] = disc;
////                qtyOrdered++;
////                System.out.println("The disc has been added");
////            }
////            else{
////                System.out.println("The cart is almost full");
////                break;
////            }
////        }
////    }
//    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
//        addDigitalVideoDisc(dvd1);
//        addDigitalVideoDisc(dvd2);
//    }
//    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
//		int index = 0;
//        for(int i=0; i<qtyOrdered; i++){
//            if(disc.equals(itemsOrdered[i])) break;
//            index++;
//        }
//        for(int i=index; i<qtyOrdered-1; i++){
//            itemsOrdered[i] = itemsOrdered[i+1];
//        }
//        qtyOrdered--;
//		System.out.printf("The disc " + disc.getTitle() + " has been removed\n");
//	}
//    public float totalCost() {
//		float SUM = 0 ;
//		for ( int i = 0 ; i < qtyOrdered ; i++ ) {
//				SUM += itemsOrdered[i].getCost();
//		}
//		return SUM;
//	}
//    
//// Print the list
//    public void print() {							  
//        System.out.println("****************************CART****************************");
//        for (int i = 0; i < qtyOrdered; i++) {
//            System.out.println(itemsOrdered[i].toString());
//        }
//        System.out.println("Total cost: " + totalCost());
//        System.out.println("************************************************************");
//    }
//// Search methods    
//    public DigitalVideoDisc searchByID(int num) {
//        for (int i = 0; i < qtyOrdered; i++) {
//            if (itemsOrdered[i].getId() == num) {
//                System.out.println("Found: " + itemsOrdered[i].toString());
//                return itemsOrdered[i];
//            }
//        }
//        System.out.println("No match is found.");
//        return null;
//    }
//
//    public DigitalVideoDisc searchByTitle(String key) {
//        for (int i = 0; i < qtyOrdered; i++) {
//            if (itemsOrdered[i].isMatch(key)) {
//                System.out.println("Found: " + itemsOrdered[i].toString());
//                return itemsOrdered[i];
//            }
//        }
//        System.out.println("No match is found.");
//        return null;
//    }
}
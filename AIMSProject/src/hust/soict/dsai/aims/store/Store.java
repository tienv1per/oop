package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    private int quantity = 0;
    public void addMedia(Media ...m_list){
        for(Media m:m_list){
            itemsInStore.add(m);
            quantity++;
        }
    }
    public void removeMedia(Media m){
        itemsInStore.remove(m);
        quantity --;
    }
    
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}


//// print Store
//    public void print() {
//        System.out.println("***********************STORE***********************");
//        for (int i = 0; i < quantity; i++) {
//            System.out.println(itemsInStore[i].toString());
//        }
//        System.out.println("**************************************************");
//    }
}
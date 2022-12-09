package hust.soict.dsai.aims.store;

// import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> itemslnStore = new ArrayList<>();
    private int quantity = 0;
    public void addMedia(Media ...m_list){
        for(Media m:m_list){
            itemslnStore.add(m);
            quantity++;
        }
    }
    public void removeMedia(Media m){
        itemslnStore.remove(m);
        quantity --;
    }

//    public void print() {
//        System.out.println("***********************STORE***********************");
//        for (int i = 0; i < quantity; i++) {
//            System.out.println(itemslnStore[i].toString());
//        }
//        System.out.println("**************************************************");
//    }
}
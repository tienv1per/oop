package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args){
        Store Store = new Store();
        Media dvd1 = new DigitalVideoDisc("The Lion King", 
        		"Animation", 19.95f, "Roger Allers", 87);
        Media dvd2 = new DigitalVideoDisc("Star Wars", 
        		"Science Fiction", 24.95f, "Geogre Lucas", 87);
        Media dvd3 = new DigitalVideoDisc("Aladin", 
        		"Animation", 18.99f);
        Media dvd4 = new DigitalVideoDisc("Aladin", 
        		"Animation", 18.99f);
        
        // To-do: Test the add & remove method here
        Store.addMedia(dvd1, dvd2, dvd3);
//        Store.print();
//        
//        Store.removeDVD(dvd2);
//        Store.print();
    }
}
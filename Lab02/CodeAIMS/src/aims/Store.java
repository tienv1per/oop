package aims;

public class Store {
    private DigitalVideoDisc[] itemslnStore = new DigitalVideoDisc[10];
    private int quantity = 0;
    public void addDVD(DigitalVideoDisc ...dvdList){
        for(DigitalVideoDisc dvd:dvdList){
            itemslnStore[quantity] = dvd;
            quantity++;
        }
    }
    public void removeDVD(DigitalVideoDisc dvd){
        int dvdID = 0;
        for (int i=0; i<quantity; i++) {
            if (itemslnStore[i].equals(dvd)) {
                break;
            }
            dvdID++;
        }
        for(int i=dvdID; i<quantity; i++){
            itemslnStore[i] = itemslnStore[i+1];
        }
        quantity --;
    }

    public void print() {
        System.out.println("***********************STORE***********************");
        for (int i = 0; i < quantity; i++) {
            System.out.println(itemslnStore[i].toString());
        }
        System.out.println("**************************************************");
    }
}
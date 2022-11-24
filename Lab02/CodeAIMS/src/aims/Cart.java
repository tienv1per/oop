package aims;

public class Cart {
    public final static int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered <= MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for(DigitalVideoDisc disc: dvdList){
            if(qtyOrdered <= MAX_NUMBERS_ORDERED){
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc has been added");
            }
            else{
                System.out.println("The cart is almost full");
                break;
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	if(qtyOrdered >= 19) {
    		System.out.println("Exceeds the permitted limits");
    	}
    	else {
    		itemsOrdered[qtyOrdered] = dvd1;
    		System.out.println("The disc has been added");
    		qtyOrdered++;
    		itemsOrdered[qtyOrdered] = dvd2;
    		System.out.println("The disc has been added");
    		qtyOrdered++;
    	}
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int index_disc = 0;
        for(int i=0; i<qtyOrdered; i++){
            if(disc.equals(itemsOrdered[i])) break;
            index_disc++;
        }
        for(int i=index_disc; i<qtyOrdered-1; i++){
            itemsOrdered[i] = itemsOrdered[i+1];
        }
        qtyOrdered--;
        System.out.println(disc.getTitle() + "has been deleted");
    }
    public float totalCost() {
        float sum = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].toString());
        }
        System.out.println("**************************************************");
    }

    public DigitalVideoDisc searchByID(int number) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == number) {
                System.out.println("Found: " + itemsOrdered[i].toString());
                return itemsOrdered[i];
            }
        }
        System.out.println("Item not found.");
        return null;
    }

    public DigitalVideoDisc searchByTitle(String keyword) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(keyword)) {
                System.out.println("Found: " + itemsOrdered[i].toString());
                return itemsOrdered[i];
            }
        }
        System.out.println("Item not found.");
        return null;
    }
}
package aims;

import aims.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBER_ORDERED)
		{
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for ( int i = 0 ; i < qtyOrdered ; i++ )
		{
			if(itemsOrdered[i].equals(disc))
			{
				itemsOrdered[i] = itemsOrdered[i+1];
			}
		}
		qtyOrdered--;
	}
	public float totalCost() {
		float SUM = 0 ;
		for ( int i = 0 ; i < qtyOrdered ; i++ ) {
				SUM += itemsOrdered[i].getCost();
		}
		return SUM;
	}
}

package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
	public Media() {
	}
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public Media(String title) {
        this();
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public abstract String toString();
    
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
    		new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
    		new MediaComparatorByCostTitle();
    @Override
    public boolean equals(Object o){
        Media tmp = (Media) o;
        return this.title.equals(tmp.getTitle());
    }
}
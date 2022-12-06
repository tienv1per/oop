package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
	private String titleString;
	private String categoryString;
	private float cost;
	private List<String> authorStrings = new ArrayList<String>();
	
	public Book(int id, String titleString, String categoryString, float cost, List<String> authorStrings) {
		super();
		this.id = id;
		this.titleString = titleString;
		this.categoryString = categoryString;
		this.cost = cost;
		this.authorStrings = authorStrings;
	}
	public int getId() {
		return id;
	}
	public String getTitleString() {
		return titleString;
	}
	public String getCategoryString() {
		return categoryString;
	}
	public float getCost() {
		return cost;
	}
	public List<String> getAuthorStrings() {
		return authorStrings;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public void setCategoryString(String categoryString) {
		this.categoryString = categoryString;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setAuthorStrings(List<String> authorStrings) {
		this.authorStrings = authorStrings;
	}
	public void addAuthor(String authorName) {
		authorStrings.add(authorName);
	}
	public void removeAuthor(String authorName) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

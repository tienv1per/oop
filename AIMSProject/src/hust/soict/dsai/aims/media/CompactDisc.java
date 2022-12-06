package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc{
	private String artist; 
	private List<Track> tracks = new ArrayList()<Track>();
	public CompactDisc(int id, String title, String category, float cost, int length, String directorString) {
		super(id, title, category, cost, length, directorString);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

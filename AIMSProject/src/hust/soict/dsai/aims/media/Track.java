package hust.soict.dsai.aims.media;

public class Track {
	private int length;
	private String title;
	
	public Track(int length, String title) {
		super();
		this.length = length;
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public String getTitle() {
		return title;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package hust.soict.dsai.aims.media;

public class Disc extends Media{
	private int length;
	private String directorString;
	public int getLength() {
		return length;
	}
	public Disc(int id, String title, String category, float cost, int length, String directorString) {
		super(id, title, category, cost);
		this.length = length;
		this.directorString = directorString;
	}
	public String getDirectorString() {
		return directorString;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setDirectorString(String directorString) {
		this.directorString = directorString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

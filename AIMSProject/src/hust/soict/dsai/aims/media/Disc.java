package hust.soict.dsai.aims.media;


public class Disc extends Media {
	public Disc() {
        super();
	}
	protected int length;
	protected String director;

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.director = director;
    }

    public Disc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost);
        this.length = length;
    }
    public Disc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String toString() {
        return null;
    }
}
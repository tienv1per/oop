package hust.soict.dsai.aims.media;

public class Track implements IPlayable{
    private String title;
    private int length;

    public Track() {

    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.print("Playing Track: " + this.title + ". ");
        System.out.println("Track length: " + this.length);
    }
    @Override
    public boolean equals(Object o){
        Track tmp = (Track)o;
        return this.title.equals(tmp.getTitle()) && this.length == tmp.getLength();
    }
}

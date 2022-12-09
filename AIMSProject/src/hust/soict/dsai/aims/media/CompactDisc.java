package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements IPlayable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(){
        super();
    }

    public CompactDisc(String artist, ArrayList<Track> tracks) {
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String artist, ArrayList<Track> tracks) {
        super(title);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, String director, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, director, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, String director, int length, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, director, length, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track a){
        if(!tracks.contains(a)){
            tracks.add(a);
        }
    }
    public void removeTrack(Track a){
        tracks.remove(a);
    }

    public int getLength(){
        return length;
    }

    @Override
    public void play() {
        System.out.println("Artist: " + this.artist);
        System.out.println("List of track");
        for(Track a:tracks){
            a.play();
        }
    }
    public String toString() {
        StringBuilder t = new StringBuilder();
        for(Track track:tracks){
            t.append(track).append(" ");
        }
        return this.artist + " " + t;
    }
}

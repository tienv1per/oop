package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<>();

    public Book() {

    }

    @Override
    public String toString() {
        StringBuilder author = new StringBuilder();
        for(String a:authors){
            author.append(a).append(" ");
        }
        return this.id + ". DVD - "
                + this.title + " - "
                + author + " - "
                + this.category + " - "
                + this.cost + " $";
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName){
        if(!authors.contains(authorName)){
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName){
        authors.remove(authorName);
    }
}

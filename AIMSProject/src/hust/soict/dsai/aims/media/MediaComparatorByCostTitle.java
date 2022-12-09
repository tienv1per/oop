package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        int check = Math.round(o1.getCost() - o2.getCost());
        return check != 0 ? check : o1.getTitle().compareTo(o2.getTitle());
    }
}

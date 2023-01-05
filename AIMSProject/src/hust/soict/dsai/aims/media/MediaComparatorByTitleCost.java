package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        int check = o1.getTitle().compareTo(o2.getTitle());
        return check != 0 ? check : Math.round(o1.getCost() - o2.getCost());
    }
}


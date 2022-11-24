package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

class WrapperClass{
    DigitalVideoDisc dvd;
    public WrapperClass(DigitalVideoDisc dvd){
        this.dvd = dvd;
    }
}
public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        WrapperClass jungle = new WrapperClass(jungleDVD);
        WrapperClass cinderella = new WrapperClass(cinderellaDVD);
        System.out.println("Before Swap");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
        swap(jungle, cinderella);
        jungleDVD = jungle.dvd;
        cinderellaDVD = cinderella.dvd;
        System.out.println("After Swap");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
    }
    public static void swap(Object o1, Object o2){
        DigitalVideoDisc tmp = ((WrapperClass)o1).dvd;
        ((WrapperClass)o1).dvd = ((WrapperClass)o2).dvd;
        ((WrapperClass)o2).dvd = tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}

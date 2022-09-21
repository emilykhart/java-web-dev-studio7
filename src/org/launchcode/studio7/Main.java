package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
    CD cd = new CD("Nevermind", 3400, "CD");
    DVD dvd = new DVD("War Games", 5000, "DVD");
    BluRay bluRay = new BluRay("Moulin Rouge", 7000, "Blu-Ray");

    cd.spinDisc();
    dvd.spinDisc();
    bluRay.spinDisc();

    cd.readData();
    dvd.readData();
    bluRay.readData();

        System.out.println(cd.getDiscInfo());
        System.out.println(dvd.getDiscInfo());
        System.out.println(bluRay.getDiscInfo());
    }
}

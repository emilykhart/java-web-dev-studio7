package org.launchcode.studio7;

public class BluRay extends DVD{
    public BluRay(String name, int storageCapacity, String discType) {
        super(name, storageCapacity, discType);
    }
    public void spinDisc(){
        System.out.println("A blu-ray spins at a rate of 75k rpm.");
    }

    public void readData(){
        System.out.println("HD DVD GOES DOWN!");
    }
}

package org.launchcode.java.exercises.technology;

public class Laptop extends Computer {
    private String color;

    public Laptop(String deviceType, String serialNumber, String operatingSystem, int storageSize, Boolean isMediumSize, String color) {
        super(deviceType, serialNumber, operatingSystem, storageSize, isMediumSize);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return " My Laptop Color:'" + color + '\'' +
                "and its serial number is" + this.getSerialNumber() + '\'' +
                "with storage" + this.getStorageSize() +
                "it's ID: "+ this.getId()+
                '}';
    }
}

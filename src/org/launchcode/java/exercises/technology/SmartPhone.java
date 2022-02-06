package org.launchcode.java.exercises.technology;

public class SmartPhone extends Computer {
    private String makerName;
    
    public SmartPhone(String deviceType, String serialNumber, String operatingSystem, int storageSize, Boolean isMediumSize, String makerName) {
        super(deviceType, serialNumber, operatingSystem, storageSize, isMediumSize);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return this.makerName;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "type='" + this.getDeviceType() + '\'' +
                ", storageSize=" + this.getStorageSize() +
                "makerName='" + this.makerName + '\'' +
                '}';
    }
}

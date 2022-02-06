package org.launchcode.java.exercises.technology;

public class Computer extends AbstractEntity {
    private String deviceType;
    private String serialNumber;
    private String operatingSystem;
    private int storageSize;
    private Boolean isMediumSize;

    public Computer(String deviceType, String serialNumber, String operatingSystem, int storageSize, Boolean isMediumSize) {
        this.deviceType = deviceType;
        this.serialNumber = serialNumber;
        this.operatingSystem = operatingSystem;
        this.storageSize = storageSize;
        this.isMediumSize = isMediumSize;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }


    public int getStorageSize() {
        return storageSize;
    }

    public boolean isMediumSize() {
        return isMediumSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + deviceType + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", storageSize=" + storageSize +
                ", isMediumSize=" + isMediumSize +
                '}';
    }
}

package org.launchcode.java.exercises.technology;

public class Program {
    public static void main(String[] args) {
//        String deviceType, String serialNumber, String operatingSystem, int storageSize, Boolean isMediumSize, String color)
        Laptop myDell = new Laptop("Laptop", "000123893", "window 10", 16, true, "silver");
        SmartPhone myPhone = new SmartPhone("Iphone", "89012345", "ios", 32, false, "Apple" );

        System.out.println("My Laptop Details: ");
        System.out.println(myDell.toString() );
        System.out.println("My Cell Phone ID:" + myPhone.getId() + " " + myPhone.toString());
    }
}

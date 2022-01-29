package org.launchcode.java.exercises.chapter2;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int length;
        int width;
        int area;
        int miles;

        System.out.println("What is the length of the rectangle?");
        length = input.nextInt();

        System.out.println("What is the width of the rectangle?");
        width = input.nextInt();

//        input.close();

        area = width * length;

        System.out.println("The area of the rectangle is "+ area + " Square units");
        System.out.println("Asking a numeric type ****************");
        System.out.println("How many miles had you driven so far?");
        miles = input.nextInt();
        System.out.println("How much gas did your car consume to reach it>");
        double gas = input.nextDouble();
        input.close();

        double milePerGallon = miles / gas;

        System.out.println("MPG for your car is>>> " + milePerGallon + " miles/gallon");


    }
}

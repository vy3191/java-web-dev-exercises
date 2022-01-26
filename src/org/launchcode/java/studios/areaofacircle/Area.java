package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double area;

        System.out.println("Enter radius of a circle: ");
        radius = input.nextDouble();

//        while(!input.hasNextInt()) {
//            System.out.println(">>>>>RADIUS MUST BE A NUMBERS ONLY<<<<<<<<<<");
//            System.out.println("Enter radius of a circle: ");
//            radius = input.nextDouble();
//
//        }

        if(radius < 0) {
            System.out.println(">>>>>RADIUS MUST BE A POSITIVE NUMBER<<<<<<<<<<");
            System.out.println("Enter radius of a circle: ");
            radius = input.nextDouble();
        }
        input.close();

        area = Circle.getArea(radius);

        System.out.println("Area of the circle is >>>> " +area+" Sq Units");

    }
}

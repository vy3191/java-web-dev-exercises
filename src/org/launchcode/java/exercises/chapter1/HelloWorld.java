package org.launchcode.java.exercises.chapter1;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name?");

        String name = input.nextLine();
        input.close();

        System.out.println("Hello " + name);
    }
}

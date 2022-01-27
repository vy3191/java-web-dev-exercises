package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        HashMap<Character, Integer> hashCounter = new HashMap<>();

        for(char ch : str.toLowerCase().toCharArray()) {
            if(hashCounter.containsKey(ch)) {
                hashCounter.put(ch, hashCounter.get(ch) + 1);
            } else {
                hashCounter.put(ch, 1);
            }
        }

        // print the hashMap.
        for(char ch : hashCounter.keySet()) {
            System.out.println(ch+ ":"+ hashCounter.get(ch));
        }
    }
}

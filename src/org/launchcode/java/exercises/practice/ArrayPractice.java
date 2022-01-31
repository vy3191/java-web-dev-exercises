package org.launchcode.java.exercises.practice;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7,8};
        String[] strNames = new String[5];
        String names = "venkateshwarlu yagatilee";
        char[] letters = new char[5];

        letters[0] = 'v';
        letters[1] = 'e';
        letters[2] = 'n';
        letters[3] = 'k';
        letters[4] = 't';



        int target = 5;

        strNames[0] = "name_1";
        strNames[1] = "name_2";
        strNames[2] = "name_3";
        strNames[3] = "name_4";
        strNames[4] = "name_5";

        for(int i =0; i < intArr.length; i++) {
            System.out.println("The number>"+ intArr[i]);
            if(intArr[i] == target) {
                System.out.println("Fount the target");
                break;
            }

        }

        for(String name : strNames) {
            System.out.println("The index of "+name);
        }
        System.out.println(names.toCharArray().length);
        System.out.println(names.length());
        for(char singleLetter : names.toCharArray()) {
            System.out.println("The letter is "+ singleLetter);
        }

        int count = 0;

        do {
            System.out.println("My count is now >>>"+ count++);
        } while(count < 5);

        for(char letter : letters) {
            System.out.println("MY LETTER IS >>>>"+ letter);
        }
    }
}

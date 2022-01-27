package exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectionsExe {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = sentence.split("\\.");
        String[] smallWords = sentence.split(" ");
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> listNumbers = new ArrayList<>();
        ArrayList<String> listWords = new ArrayList<>(Arrays.asList(smallWords));

        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(5);
        listNumbers.add(6);
        listNumbers.add(7);
        listNumbers.add(8);
        listNumbers.add(9);
        listNumbers.add(10);
        listNumbers.add(11);

        for(int num : numbers) {
            if(num % 2 != 0) {
                System.out.println("Number in array: "+ num);
            }
        }

        System.out.println(Arrays.toString(words));
        System.out.println("************************************************");
        int total = findSum(listNumbers);

        System.out.println("Total Even numbers from the array list is:" + total);

        System.out.println("*******************************************************");
        System.out.println("Enter the desired length for search: ");
        int userInput = input.nextInt();

        if (userInput > 0) {
            getWordLengthWithFive(listWords, userInput);
        } else {
            System.out.println("Only positive number are accepted");;
        }


    }

    public static int findSum(ArrayList<Integer> listNumbers) {
        int sum = 0;
        for(Integer num : listNumbers) {
            if(num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static void getWordLengthWithFive(ArrayList<String> arr, int len){
        for(String word : arr) {
            if(word.length() == len) {
                System.out.println("Word with "+ len +" letters: " + word);
            }
        }

    }
}

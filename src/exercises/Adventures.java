package exercises;
import java.util.Scanner;

public class Adventures {
    public static void main(String[] arg) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        String searchWord;
        int index;
        int length;
        String wordsArr[] = sentence.split(" ");
        String new_string = "";

        System.out.println("Let me know what word are searching for..?");

        searchWord = input.nextLine();
        length = searchWord.length();
        index = sentence.toLowerCase().indexOf(searchWord.toLowerCase());
        input.close();

        if( index > -1) {
            System.out.println("You have found the word "+ searchWord + " in the sentence. And its index is " + index + " and its length is "+ length);
//            for(String eachWord :wordsArr) {
//                if(!eachWord.toLowerCase().equals(searchWord.toLowerCase())) {
//                    new_string += eachWord+ " ";
//                }
//            }
            new_string = sentence.substring(0, index) + sentence.substring(index+length, sentence.length());
            System.out.println("Our new sentence is>>>");
            System.out.println(new_string);
        } else {
            System.out.println("You have NOT found the word "+ searchWord + " in the sentence");
        }

    }
}

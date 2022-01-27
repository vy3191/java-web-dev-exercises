package exercises;
import java.util.Arrays;

public class CollectionsExe {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        String sentense = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = sentense.split("\\.");

        for(int num : numbers) {
            if(num % 2 != 0) {
                System.out.println("Number in array: "+ num);
            }
        }

        System.out.println(Arrays.toString(words));
    }
}

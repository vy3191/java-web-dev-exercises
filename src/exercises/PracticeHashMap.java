package exercises;
import java.util.HashMap;
import java.util.Scanner;

public class PracticeHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();
        String studentName;

        // Get the student names and grads here.
        do {
            System.out.println("Enter the student name: ");

            studentName = input.nextLine();

            // if the student name is not empty, get the grade details.
            if(!studentName.isEmpty()) {
                System.out.println("Enter student ID:");
                if(input.hasNextInt()) {
                    int studentId = input.nextInt();
                    students.put(studentId, studentName);
                    input.nextLine();
                }
            }

        } while(!studentName.isEmpty());

        // close the input now.
        input.close();
        // Print the clas roster.
        for(int id : students.keySet()) {
            System.out.println(id + ":"+ students.get(id));
        }
    }
}

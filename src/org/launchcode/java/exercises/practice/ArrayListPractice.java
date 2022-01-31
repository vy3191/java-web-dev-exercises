package org.launchcode.java.exercises.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        double sum = 0.0;
        double avg;

        System.out.println("***********************************************");
        System.out.println("Enter your students data");
        System.out.println("***********************************************");

        // Getting students data - using do while loop as long as there use input is empty
        do {
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                students.add(newStudent);
            }
            input.nextLine();
        } while(!newStudent.equals(""));

        // Getting the students grads.
        for(String student : students) {
            System.out.println("Enter the grade for the student "+ student);
            Double grade = input.nextDouble();
            grades.add(grade);
        }

        System.out.println("***********************************************");
        System.out.println("\nClass Roster");
        System.out.println("***********************************************");

        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i)+":"+grades.get(i));
            sum += grades.get(i);
        }

        avg = sum/students.size();

        System.out.println("The average grade of the class is: "+ avg);

    }
}

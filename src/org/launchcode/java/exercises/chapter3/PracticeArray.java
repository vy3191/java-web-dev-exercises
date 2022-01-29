package org.launchcode.java.exercises.chapter3;

import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        int maxStudents = 10;

        Scanner input = new Scanner(System.in);
        String[] students = new String[maxStudents];
        Double[] grades = new Double[maxStudents];

        String newStudent;
        int count = 0;

        System.out.println("Enter a new student: ");

        do {
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                students[count] = newStudent;
                count++;
            }

        } while(!newStudent.equals(""));

            for(String student: students) {
                System.out.println("Enter grades for"+ student + ":");
                Double grade = input.nextDouble();
                grades[grades.length] = grade;

            }
        input.close();
        System.out.println(students);
        System.out.println(grades);
    }
}

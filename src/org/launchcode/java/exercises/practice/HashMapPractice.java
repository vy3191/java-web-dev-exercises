package org.launchcode.java.exercises.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("***************************");
        System.out.println("Enter Student Name and Grade Below>>>>> ");
        System.out.println("***************************");

        do {
            System.out.println("Enter Student Name:");
            newStudent = input.nextLine();

            if(!newStudent.isEmpty()) {
                System.out.println("Enter Student Grade:");
                double grade = input.nextDouble();
                students.put(newStudent, grade);

                input.nextLine();
            }
        } while(!newStudent.isEmpty());

        // Print the student - details:
//        for(String student : students.keySet()) {
//            System.out.println(student+":"+students.get(student));
//        }

        for(Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey()+":"+student.getValue());
        }

    }
}

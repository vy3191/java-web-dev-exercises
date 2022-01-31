package org.launchcode.java.exercises.school;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("venky1", 12, 1, 4.0);
        Student student2 = new Student("venky2", 13, 1, 4.0);
        Student student3 = new Student("venky3", 14, 1, 4.0);
        Student student4 = new Student("venky4", 15, 1, 4.0);

        Teacher teacher = new Teacher("vitaly", "Uchenkov", "computer science", 10);

        Course myCourse = new Course(12234, teacher);

        myCourse.addStudents(student1);
        myCourse.addStudents(student2);
        myCourse.addStudents(student3);
        myCourse.addStudents(student4);
        myCourse.removeStudents(student2);

        System.out.println("My course id: " + myCourse.getCourseId());
        System.out.println("My teacher name: " + myCourse.getTeacher().getFirstName() + " " + myCourse.getTeacher().getLastName());

        System.out.println("My students list: ");
        for(Student student : myCourse.getStudents()) {
            System.out.println(student.getName());
        }


    }
}

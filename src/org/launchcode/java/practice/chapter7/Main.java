package org.launchcode.java.practice.chapter7;

public class Main {
    public static void main(String[] args) {
        Account student = new Student("Venky", "yagatilee");
        Account teacher = new Teacher("venkateshwarlu", "YAGAT", 3, "Mr.", "Mathematics");

        // Get the things only from and related to Account class.

//        System.out.println(student.getDisplayName());
//        System.out.println(teacher.getDisplayName());
        printAccount(student);
//        printAccount(teacher);
        System.out.println(student instanceof Object);

    }

    public static void printAccount(Account account) {
        String nameString = account.getId()+"."+account.getDisplayName();

        if(account instanceof Teacher) {

            System.out.println("Teacher: "+ nameString);
        } else if(account instanceof Student) {
            Student theStudent = (Student) account;
            System.out.println("Student:"+ nameString+" with GPA:"+ theStudent.getGpa());
        }
    }

}

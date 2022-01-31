package org.launchcode.java.exercises.school;

public class Student {
    private String name;
    private int age;
    private int numberOfCredits;
    private double GPA;

    public Student(String name, int age, int numberOfCredits, double GPA) {
        this.name = name;
        this.age = age;
        this.numberOfCredits = numberOfCredits;
        this.GPA = GPA;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public int getNumberOfCredits() {

        return numberOfCredits;
    }

    public double getGPA() {

        return GPA;
    }

    public void setName(String name) {

        this.name = name;
    }

    private void setAge(int aAge) {

        this.age = aAge;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {

        this.numberOfCredits = aNumberOfCredits;
    }

    public void setGPA(double aGPA) {

        this.GPA = aGPA;
    }
}

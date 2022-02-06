package org.launchcode.java.practice.chapter7;

public class Student extends Account {
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String firstName, String lastName, int numberOfCredits, double gpa) {
        super(firstName, lastName);
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0);
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }
}

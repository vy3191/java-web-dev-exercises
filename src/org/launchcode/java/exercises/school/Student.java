package org.launchcode.java.exercises.school;

public class Student {
    private String name;
    private int age;
    private int numberOfCredits = 1;
    private double GPA = 4.0;

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

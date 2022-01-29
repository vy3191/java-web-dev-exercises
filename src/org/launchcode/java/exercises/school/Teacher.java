package org.launchcode.java.exercises.school;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public String getSubject() {
        return this.subject;
    }

    public int getYearsTeaching() {
        return this.yearsTeaching;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}

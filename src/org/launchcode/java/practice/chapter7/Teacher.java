package org.launchcode.java.practice.chapter7;

public class Teacher extends Account {
    private int yearsOfExp;
    private String subject;
    private String honorific;

    public Teacher(String firstName, String lastName, int yearsOfExp, String honorific, String subject) {
        this(firstName, lastName);
        this.yearsOfExp = yearsOfExp;
        this.subject = subject;
        this.honorific = honorific;
    }

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public String getSubject() {
        return subject;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getDisplayName() {
        return this.honorific+ " "+this.getFirstName()+" "+this.getLastName();
    }
}

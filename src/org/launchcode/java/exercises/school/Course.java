package org.launchcode.java.exercises.school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private int courseId;
    private ArrayList<String> teachers = new ArrayList<>();
    private HashMap<Integer, String> students  = new HashMap<>();

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int aCourseId) {
        this.courseId = aCourseId;
    }

    public ArrayList<String> getTeachers() {
        return this.teachers;
    }

    public void setTeachers(String teacher) {
        this.teachers.add(teacher);
    }

    public HashMap<Integer, String> getStudents() {
        return students;
    }

    public void setStudents(Student aStudent) {
        this.students.put(aStudent.getNumberOfCredits(), aStudent.getName());
    }
}

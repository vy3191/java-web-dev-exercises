package org.launchcode.java.exercises.school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private int courseId;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course(int courseId, Teacher teacher, ArrayList<Student> students) {
        this.courseId = courseId;
        this.teacher = teacher;
        this.students = students;
    }

    public Course(int courseId, Teacher teacher) {
        this(courseId, teacher, new ArrayList<Student>());
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudents(Student aStudent) {
        this.students.add(aStudent);
    }

    public void removeStudents(Student aStudent) {
        this.students.remove(aStudent);
    }
}

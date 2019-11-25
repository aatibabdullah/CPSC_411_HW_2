package com.example.homeworktwo.model;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    protected ArrayList<Student> student;

    static public StudentDB getInstance() { return ourInstance;}

    private StudentDB() { createStudentObjects();}

    public ArrayList<Student> getStudent() {return student;}

    public void setStudent(ArrayList<Student> stud) {
        student = stud;
    }

    protected void createStudentObjects(){
        Student s;

        ArrayList<Course> coursesenrolled = new ArrayList<Course>();
        student = new ArrayList<Student>();

        s = new Student("John", "Marston", 889500617);
        coursesenrolled.add(new Course("MATH 250","A"));
        coursesenrolled.add(new Course("CPSC 335","C"));
        s.setCourses(coursesenrolled);

        student.add(s);

        s = new Student("Javier", "Machoman", 201151000);
        coursesenrolled = new ArrayList<Course>();
        coursesenrolled.add(new Course("MATH 250","A"));
        coursesenrolled.add(new Course("CPSC 335","C"));
        s.setCourses(coursesenrolled);

        student.add(s);
    }


}

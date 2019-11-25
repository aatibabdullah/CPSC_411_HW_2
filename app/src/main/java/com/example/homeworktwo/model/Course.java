package com.example.homeworktwo.model;

public class Course {

    protected String courseid;
    protected String grade;

    public Course(String course, String letter)
    {
        courseid = course;
        grade = letter;
    }

    public String getCourseid() {
        return courseid;
    }
    public String getGrade() {
        return grade;
    }

    public void setCourseid(String courseiden){courseid = courseiden;}
    public void setGrade(String Grade){grade = Grade;}
}

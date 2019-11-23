package com.example.homeworktwo.model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

public class Student {
    protected String FirstName;
    protected String LastName;
    protected int CWID;
    protected ArrayList<Course> Course;

    public Student(String fName, String lName, int id)
    {
        FirstName = fName;
        LastName = lName;
        CWID = id;
    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getIdentification(){return CWID;}

    public void setCWID(int number){ CWID = number;}



    public ArrayList<Course> getCourses() {
        return Course;
    }

    public void setCourses(ArrayList<Course> courses) {
        Course = courses;
    }




}

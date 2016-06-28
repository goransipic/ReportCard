package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by goransi on 28.6.2016..
 */
public class Teacher {

    private ArrayList<Student> mStudents;

    public Teacher(ArrayList<Student> mStudents) {
        this.mStudents = mStudents;
    }

    public ArrayList<Student> getStudents() {
        return mStudents;
    }

    public void setStudents(ArrayList<Student> students) {
        this.mStudents = mStudents;
    }
}

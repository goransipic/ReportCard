package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ReportCard reportCard1 = new ReportCard("A", "History");
        ReportCard reportCard2 = new ReportCard("C", "Math");
        ReportCard reportCard3 = new ReportCard("C", "English");

        ArrayList<ReportCard> reportCards = new ArrayList<>();
        reportCards.add(reportCard1);
        reportCards.add(reportCard2);
        reportCards.add(reportCard3);

        Student student1 = new Student("John Show", reportCards);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);

        Teacher teacher = new Teacher(students);


    }
}

package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by goransi on 28.6.2016..
 */
public class Student {

    private String mName;

    private ArrayList<ReportCard> mReportCard;

    public Student(String mName, ArrayList<ReportCard> mReportCard) {
        this.mName = mName;
        this.mReportCard = mReportCard;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public ArrayList<ReportCard> getReportCard() {
        return mReportCard;
    }

    public void setReportCard(ArrayList<ReportCard> reportCard) {
        this.mReportCard = reportCard;
    }
}

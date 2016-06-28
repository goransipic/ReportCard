package com.example.android.reportcard;

/**
 * Created by goransi on 28.6.2016..
 */
public class ReportCard {

    private String mGrade;
    private String mStudentClass;


    public ReportCard(String grade, String studentClass) {
                this.mGrade = grade;
        this.mStudentClass = studentClass;
    }

    public String getStudentClass() {
        return mStudentClass;
    }

    public void setStudentClass(String mStudentClass) {
        this.mStudentClass = mStudentClass;
    }

    public String getGrade() {
        return mGrade;
    }

    public void setGrade(String mGrade) {
        this.mGrade = mGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mGrade='" + mGrade + '\'' +
                ", mStudentClass='" + mStudentClass + '\'' +
                '}';
    }
}

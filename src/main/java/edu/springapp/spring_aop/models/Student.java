package edu.springapp.spring_aop.models;

public class Student {
    private String surName;
    private Integer course;
    private Double averageGrade;

    public Student(String surName,Integer course,Double averageGrade){
        this.surName=surName;
        this.course=course;
        this.averageGrade=averageGrade;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surName='" + surName + '\'' +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }
}

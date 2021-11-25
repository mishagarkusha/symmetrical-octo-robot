package com.suitt.gk.assignment3.models;

public class Scientist extends Person {
    private String fieldInScience;
    private String academicDegree;

    public Scientist(String name, int age, String career, String fieldInScience, String academicDegree) {
        super(name, age, career);
        this.fieldInScience = fieldInScience;
        this.academicDegree = academicDegree;
    }

    public Scientist() {
        this.fieldInScience = "Nothing";
        this.academicDegree = "Nothing";
    }

    public String getFieldInScience() {
        return fieldInScience;
    }

    public void setFieldInScience(String fieldInScience) {
        this.fieldInScience = fieldInScience;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return setGreenColorText("Scientist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", career='" + career + '\'' +
                ", fieldInScience='" + fieldInScience + '\'' +
                ", academicDegree='" + academicDegree + '\'' +
                '}');
    }

    public void outputScientistInfo() {
        print(name + " is scientist in " + fieldInScience + " field and " + name + "'s degree is " + academicDegree);
    }
}


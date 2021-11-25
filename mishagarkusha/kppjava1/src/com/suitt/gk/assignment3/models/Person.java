package com.suitt.gk.assignment3.models;


import static com.suitt.gk.assignment3.utils.Constants.*;

public class Person {
    protected String name;
    protected int age;
    protected String career;

    public Person(String name, int age, String career) {
        this.name = name;
        this.age = age;
        this.career = career;
    }

    public Person() {
        this.name = "Mister Crabs";
        this.age = 0;
        this.career = "CEO";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return setGreenColorText("Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", career='" + career + '\'' +
                '}');
    }


    public boolean isPersonAdult() {
        return age >= 18;
    }

    protected void print(String text) {
        System.out.println(ANSI_RED + text + ANSI_RESET);
    }

    protected String setGreenColorText(String text) {
        return ANSI_GREEN + text + ANSI_RESET;
    }
}

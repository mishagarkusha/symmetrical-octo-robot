package com.suitt.gk.assignment1.task2;

import java.util.ArrayList;

public class Database {

    private ArrayList<Student> myGroup;

    public ArrayList<Student> getGroupList() {
        if(myGroup == null) {
            initDatabase();
        }
        return myGroup;
    }

    private void initDatabase() {
        myGroup = new ArrayList<>();
        myGroup.add(new Student("Алина", "Бейда", 1));
        myGroup.add(new Student("Бурчаков", "Роман", 2));
        myGroup.add(new Student("Козельская", "Вероника", 3));
        myGroup.add(new Student("Коноплян", "Михаил", 4));
        myGroup.add(new Student("Лавшук", "Кирилл", 5));
        myGroup.add(new Student("Микитенко", "Иван", 6));
        myGroup.add(new Student("Миронова", "Лилия", 7));
        myGroup.add(new Student("Орлов", "Евгений", 8));
        myGroup.add(new Student("Пантелеев", "Владислав", 9));
        myGroup.add(new Student("Теплов", "Вадим", 10));
        myGroup.add(new Student("Урвачов", "Алексей", 11));
        myGroup.add(new Student("Шпика", "Богдан", 12));
    }
}

package com.suitt.gk.assignment1.task2;

public record Student(String surname, String name, int numberInJournal) {

    @Override
    public String toString() {
        return numberInJournal + ". " + name + " " + surname;
    }
}

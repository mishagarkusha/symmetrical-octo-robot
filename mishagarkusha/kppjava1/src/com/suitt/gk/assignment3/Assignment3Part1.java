package com.suitt.gk.assignment3;

import com.suitt.gk.assignment3.models.*;

import java.util.*;

import static com.suitt.gk.assignment3.utils.Constants.*;

public class Assignment3Part1 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        testPerson();
        testSportsman();
        testBoxer();
        testScientist();
    }

    private static void testScientist() {
        //Testing of class scientists
        System.out.println("\n\n\n" + ANSI_CYAN_BACKGROUND + ANSI_BLACK + "------>Scientist<------" + ANSI_RESET);
        Scientist[] scientists = new Scientist[3];
        scientists[0] = new Scientist("Eugene", random.nextInt(100), listOfCareers.poll(), listOfFieldsInScience.poll(), listOfAcademicDegrees.poll());
        scientists[1] = new Scientist();
        scientists[2] = new Scientist("Ivan", random.nextInt(100), listOfCareers.poll(), listOfFieldsInScience.poll(), listOfAcademicDegrees.poll());
        for (Scientist scientist : scientists) {
            System.out.println(scientist);
            System.out.println("Is scientist adult? - " + ANSI_BLUE + scientist.isPersonAdult() + ANSI_RESET);
            scientist.outputScientistInfo();
            scientist.setName(listOfNames.poll());
            scientist.setAge(random.nextInt(100));
            scientist.setFieldInScience(listOfFieldsInScience.poll());
            scientist.setAcademicDegree(listOfAcademicDegrees.poll());
            scientist.setCareer(listOfCareers.poll());
            System.out.println("New field in science is " + ANSI_BLUE + scientist.getFieldInScience() + ANSI_RESET);
            System.out.println("New academic degree is " + ANSI_BLUE + scientist.getAcademicDegree() + ANSI_RESET);
            System.out.println("New name of scientist is " + ANSI_BLUE + scientist.getName() + ANSI_RESET);
            System.out.println("New age of scientist is " + ANSI_BLUE + scientist.getAge() + ANSI_RESET);
            System.out.println("New career of scientist is " + ANSI_BLUE + scientist.getCareer() + ANSI_RESET);
            System.out.println();
        }
    }

    private static void testBoxer() {
        //Testing of class boxer
        System.out.println("\n\n\n" + ANSI_CYAN_BACKGROUND + ANSI_BLACK + "------>Boxer<------" + ANSI_RESET);
        Boxer[] boxers = new Boxer[3];
        boxers[0] = new Boxer("Malcolm", random.nextInt(100), listOfCareers.poll(), "Boxing", listOfAchievementsInSport.get(random.nextInt(listOfAchievementsInSport.size())), WeightDivisions.MINIMUM_WEIGHT);
        boxers[1] = new Boxer();
        boxers[2] = new Boxer("Peter", random.nextInt(100), listOfCareers.poll(), "Boxing", listOfAchievementsInSport.get(random.nextInt(listOfAchievementsInSport.size())), WeightDivisions.FEATHERWEIGHT);
        for (Boxer boxer : boxers) {
            System.out.println(boxer);
            System.out.println("Is boxer adult? - " + ANSI_BLUE + boxer.isPersonAdult() + ANSI_RESET);
            System.out.println("Boxer's weight limit is " + ANSI_BLUE + boxer.getLimitsOfWeightDivision() + ANSI_RESET);
            boxer.outputKindOfSport();
            boxer.setAchievementInSport(listOfAchievementsInSport.get(random.nextInt(listOfAchievementsInSport.size())));
            boxer.setKindOfSport(listOfKindsOfSport.get(random.nextInt(listOfKindsOfSport.size())));
            boxer.setName(listOfNames.poll());
            boxer.setAge(random.nextInt(100));
            boxer.setWeightDivisions(WeightDivisions.SUPER_FEATHERWEIGHT);
            boxer.setCareer(listOfCareers.poll());
            System.out.println("New weight division is " + ANSI_BLUE + boxer.getWeightDivisions() + ANSI_RESET);
            System.out.println("New achievement in sport is " + ANSI_BLUE + boxer.getAchievementInSport() + ANSI_RESET);
            System.out.println("New kind of sport is " + ANSI_BLUE + boxer.getKindOfSport() + ANSI_RESET);
            System.out.println("New name of boxer is " + ANSI_BLUE + boxer.getName() + ANSI_RESET);
            System.out.println("New age of boxer is " + ANSI_BLUE + boxer.getAge() + ANSI_RESET);
            System.out.println("New career of boxer is " + ANSI_BLUE + boxer.getCareer() + ANSI_RESET);
            System.out.println();
        }
    }

    private static void testSportsman() {
        //Testing of class sportsman
        System.out.println("\n\n\n" + ANSI_CYAN_BACKGROUND + ANSI_BLACK + "------>Sportsman<------" + ANSI_RESET);
        Sportsman[] sportsmen = new Sportsman[3];
        sportsmen[0] = new Sportsman("Vasiliy", random.nextInt(100), listOfCareers.poll(), listOfKindsOfSport.get(random.nextInt(listOfKindsOfSport.size())), listOfAchievementsInSport.get(random.nextInt(listOfAchievementsInSport.size())));
        sportsmen[1] = new Sportsman();
        sportsmen[2] = new Sportsman("Nikolay", random.nextInt(100), listOfCareers.poll(), listOfKindsOfSport.get(random.nextInt(listOfKindsOfSport.size())), listOfAchievementsInSport.get(random.nextInt(listOfAchievementsInSport.size())));
        for (Sportsman sportsman : sportsmen) {
            System.out.println(sportsman);
            System.out.println("Is sportsman adult? - " + ANSI_BLUE + sportsman.isPersonAdult() + ANSI_RESET);
            sportsman.outputKindOfSport();
            sportsman.setAchievementInSport(listOfAchievementsInSport.get(random.nextInt(listOfAchievementsInSport.size())));
            sportsman.setKindOfSport(listOfKindsOfSport.get(random.nextInt(listOfKindsOfSport.size())));
            sportsman.setName(listOfNames.poll());
            sportsman.setAge(random.nextInt(100));
            sportsman.setCareer(listOfCareers.poll());
            System.out.println("New achievement in sport is " + ANSI_BLUE + sportsman.getAchievementInSport() + ANSI_RESET);
            System.out.println("New kind of sport is " + ANSI_BLUE + sportsman.getKindOfSport() + ANSI_RESET);
            System.out.println("New name of sportsman is " + ANSI_BLUE + sportsman.getName() + ANSI_RESET);
            System.out.println("New age of sportsman is " + ANSI_BLUE + sportsman.getAge() + ANSI_RESET);
            System.out.println("New career of sportsman is " + ANSI_BLUE + sportsman.getCareer() + ANSI_RESET);
            System.out.println();
        }
    }

    private static void testPerson() {
        //Testing of class persons
        System.out.println("\n\n\n" + ANSI_CYAN_BACKGROUND + ANSI_BLACK + "------>Person<------" + ANSI_RESET);
        Person[] persons = new Person[3];
        persons[0] = new Person("Till", random.nextInt(100), listOfCareers.poll());
        persons[1] = new Person();
        persons[2] = new Person("Dustin", random.nextInt(100), listOfCareers.poll());
        for (Person person : persons) {
            System.out.println(person);
            System.out.println("Is person adult? - " + ANSI_BLUE + person.isPersonAdult() + ANSI_RESET);
            person.setName(listOfNames.poll());
            person.setAge(random.nextInt(100));
            person.setCareer(listOfCareers.poll());
            System.out.println("New name of person is " + ANSI_BLUE + person.getName() + ANSI_RESET);
            System.out.println("New age of person is " + ANSI_BLUE + person.getAge() + ANSI_RESET);
            System.out.println("New career of person is " + ANSI_BLUE + person.getCareer() + ANSI_RESET);
            System.out.println();
        }
    }
}

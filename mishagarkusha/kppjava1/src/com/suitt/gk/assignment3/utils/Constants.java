package com.suitt.gk.assignment3.utils;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public interface Constants {
     String ANSI_GREEN = "\u001B[32m";
     String ANSI_RED = "\u001B[31m";
     String ANSI_RESET = "\u001B[0m";
     String ANSI_BLUE = "\u001B[34m";
     String ANSI_BLACK = "\u001B[30m";
     String ANSI_CYAN_BACKGROUND = "\u001B[46m";
     List<String> listOfKindsOfSport = Arrays.asList("Dancing", "Racing", "Boxing", "Swimming", "Chess");
     List<String> listOfAchievementsInSport = Arrays.asList("Master", "Professional", "Beginner", "Adept", "Legend");
     Queue<String> listOfFieldsInScience = new ArrayDeque<>(Arrays.asList("Biology",
            "Math",
            "Chemistry",
            "Philosophy",
            "Psychology"));

     Queue<String> listOfAcademicDegrees = new ArrayDeque<>(Arrays.asList("Associate's degree",
            "Bachelor's degree",
            "Master's degree",
            "Doctoral degree",
            "Bachelor's degree"));
     Queue<String> listOfNames = new ArrayDeque<>(Arrays.asList(
            "Marshall",
            "Stephen",
            "Albert",
            "Michael",
            "Daniel",
            "Richard",
            "Lincoln",
            "Dave",
            "David",
            "Vlad",
            "Denis",
            "Andrew"
    ));
     Queue<String> listOfCareers = new ArrayDeque<>(Arrays.asList(
            "Acquisitions Librarian",
            "Acquisitions Logistics Analyst",
            "Ad Writer",
            "Adjuster Arbitrator",
            "Advertising Copy Writer",
            "Air Conditioning Unit Tester",
            "Airline Security Representative",
            "Ammunition Officer",
            "Alemite Operator",
            "Chart Computer",
            "CNC Machinist (Computer Numerical Control Machinist)",
            "Computer Analyst",
            "Computer Artist",
            "Computer Consultant",
            "Computer Engineer",
            "Computer Game Designer",
            "Computer Hardware Technician",
            "Computer Hardware Developer",
            "Computer Graphics Illustrator",
            "CNC Operator (Computerized Numerical Control Operator)"));
}

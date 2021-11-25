package com.suitt.gk.assignment4;


import com.suitt.gk.assignment4.utils.Time;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static com.suitt.gk.assignment3.utils.Constants.*;

public class Assignment4Part1 {
    private static final Random random = new Random();
    private static final List<String> listOfCities = Arrays.asList("Kharkov", "Lvov", "Kiev", "Washington", "New York", "Dnipro", "Vancouver");

    public static void main(String[] args) {
        testTrain();
    }

    public static String selectTrains(Train[] trains, String destination) {
        List<Train> selectedTrains = Arrays.stream(trains)
                .filter(x -> destination.equals(x.getDestination()))
                .collect(Collectors.toList());

        System.out.println("Selected trains - " + selectedTrains);
        return ("Amount of trains that depart after 21: " +
                (int) Arrays.stream(selectedTrains.toArray(new Train[0]))
                        .filter(x -> x.getDepartureTime().getHour() >= 21).count()
        );
    }


    private static void testTrain() {
        //Testing of class train
        System.out.println("\n\n\n" + ANSI_CYAN_BACKGROUND + ANSI_BLACK + "------>Train<------" + ANSI_RESET);
        Train[] trains = getArrayOfTrains(100);

        for (Train train : trains) {
            System.out.println(train.toString());
            train.setTrainNumber(random.nextInt(100));
            train.setArrivalTime(Time.getRandomTime());
            train.setDepartureTime(Time.getRandomTime());
            train.setDestination(listOfCities.get(random.nextInt(listOfCities.size())));
            System.out.println("Arrival time is " + ANSI_BLUE + train.getArrivalTime() + ANSI_RESET);
            System.out.println("Departure time is " + ANSI_BLUE + train.getDepartureTime() + ANSI_RESET);
            System.out.println("Destination is " + ANSI_BLUE + train.getDestination() + ANSI_RESET);
            System.out.println("Travel time is " + ANSI_BLUE + train.getTravelTime() + ANSI_RESET);
            System.out.println("Train number is " + ANSI_BLUE + train.getTrainNumber() + ANSI_RESET);
            System.out.println();
        }

        System.out.println(selectTrains(trains, listOfCities.get(random.nextInt(listOfCities.size()))));
    }

    private static Train[] getArrayOfTrains(int size) {
        Train[] trains = new Train[size];
        trains[0] = new PassengerTrain(
                "Odessa",
                245,
                Time.getRandomTime(),
                Time.getRandomTime(),
                150
        );
        trains[1] = new PassengerTrain(100);
        for (int i = 2; i < trains.length; i++) {
            trains[i] = new PassengerTrain();
        }
        return trains;
    }

}

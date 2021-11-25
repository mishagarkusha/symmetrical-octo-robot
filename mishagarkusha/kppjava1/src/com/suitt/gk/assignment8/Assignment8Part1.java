package com.suitt.gk.assignment8;

import com.suitt.gk.assignment4.PassengerTrain;
import com.suitt.gk.assignment4.utils.Time;

import java.io.*;
import java.util.ArrayList;

public class Assignment8Part1 {
    public static void main(String[] args) {
        ArrayList<PassengerTrain> passengerTrainArrayList = new ArrayList<>();
        passengerTrainArrayList.add(new PassengerTrain("Odessa", 5, Time.getRandomTime(), Time.getRandomTime(), 50));
        passengerTrainArrayList.add(new PassengerTrain("Kiev", 6, Time.getRandomTime(), Time.getRandomTime(), 60));
        passengerTrainArrayList.add(new PassengerTrain("Lvov", 7, Time.getRandomTime(), Time.getRandomTime(), 70));
        passengerTrainArrayList.add(new PassengerTrain("Kharkov", 8, Time.getRandomTime(), Time.getRandomTime(), 80));


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))) {
            for (var item : passengerTrainArrayList) {
                bw.write(item.getDestination() + " ");
                bw.write(item.getTrainNumber() + " ");
                bw.write(item.getDepartureTime() + " ");
                bw.write(item.getArrivalTime() + " ");
                bw.write(String.valueOf(item.getAmountOfPassengers()));
                bw.newLine();
            }
            System.out.println("File has been written successfully!");
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] classFields = s.split(" ");
                /*
                String destination, int trainNumber, Time departureTime, Time arrivalTime, int amountOfPassengers
                 */
                System.out.println(new PassengerTrain(
                        classFields[0],
                        Integer.parseInt(classFields[1]),
                        new Time(classFields[2]),
                        new Time(classFields[3]),
                        Integer.parseInt(classFields[4])));
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}

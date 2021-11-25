package com.suitt.gk.assignment8;

import com.suitt.gk.assignment4.PassengerTrain;
import com.suitt.gk.assignment4.utils.Time;

import java.io.*;
import java.util.ArrayList;

public class Assignment8Part2 {
    public static void main(String[] args) {
        ArrayList<PassengerTrain> passengerTrainArrayList = new ArrayList<>();
        passengerTrainArrayList.add(new PassengerTrain("Odessa", 5, Time.getRandomTime(), Time.getRandomTime(), 50));
        passengerTrainArrayList.add(new PassengerTrain("Kiev", 6, Time.getRandomTime(), Time.getRandomTime(), 60));
        passengerTrainArrayList.add(new PassengerTrain("Lvov", 7, Time.getRandomTime(), Time.getRandomTime(), 70));
        passengerTrainArrayList.add(new PassengerTrain("Kharkov", 8, Time.getRandomTime(), Time.getRandomTime(), 80));

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data2.txt"))) {
            for (var item : passengerTrainArrayList) {
                dos.writeUTF(item.getDestination());
                dos.writeInt(item.getTrainNumber());
                dos.writeUTF(item.getDepartureTime().toString());
                dos.writeUTF(item.getArrivalTime().toString());
                dos.writeInt(item.getAmountOfPassengers());
            }
            System.out.println("File has been written successfully!");
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("data2.txt"))) {
            while (dis.available() != 0) {
                System.out.println(new PassengerTrain(
                        dis.readUTF(),
                        dis.readInt(),
                        new Time(dis.readUTF()),
                        new Time(dis.readUTF()),
                        dis.readInt()));
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}

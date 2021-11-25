package com.suitt.gk.assignment7;

import com.suitt.gk.assignment4.Assignment4Part1;
import com.suitt.gk.assignment4.PassengerTrain;
import com.suitt.gk.assignment4.utils.Time;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment7Part1 {
    private JPanel MainPanel;
    private JTextField textFieldDestination;
    private JTextField textFieldTrainNumber;
    private JTextField textFieldDepartureTime;
    private JTextField textFieldArrivalTime;
    private JTextField textFieldAmountOfPassengers;
    private JButton buttonCreatePassengerTrain;
    private JTable tablePassengerTrains;
    private JButton buttonClearTable;
    private JTextField textFieldInput;
    private JButton buttonInput;
    private JButton buttonOutput;
    private JTextField textFieldOutput;

    private JTextField textFieldMethod;
    private JButton buttonMethod;
    private JButton buttonTask2;
    private JTextField textFieldTask2;
    private JTextField textFieldDestinationCity;
    private static DefaultTableModel tableModel;

    private PassengerTrain passengerTrain;

    public Assignment7Part1() {
        buttonCreatePassengerTrain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passengerTrain = new PassengerTrain(
                        Assignment7Part1.this.getDestination(),
                        Assignment7Part1.this.getTrainNumber(),
                        Assignment7Part1.this.getDepartureTime(),
                        Assignment7Part1.this.getArrivalTime(),
                        Assignment7Part1.this.getAmountOfPassengers()
                );

                buttonInput.setEnabled(true);
                buttonOutput.setEnabled(true);
                textFieldInput.setEnabled(true);
                textFieldMethod.setEnabled(true);
                buttonMethod.setEnabled(true);
                buttonTask2.setEnabled(true);
                textFieldTask2.setEnabled(true);
                textFieldDestinationCity.setEnabled(true);

                tableModel.addRow(new Object[]{
                                passengerTrain.getDestination(),
                                passengerTrain.getTrainNumber(),
                                passengerTrain.getDepartureTime(),
                                passengerTrain.getArrivalTime(),
                                passengerTrain.getAmountOfPassengers()
                        }
                );

                tablePassengerTrains.setModel(tableModel);
            }
        });

        buttonClearTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.setNumRows(0);
                tablePassengerTrains.setModel(tableModel);
            }
        });
        buttonInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passengerTrain.setAmountOfPassengers(Assignment7Part1.this.getAmountOfPassengersFromInput());
            }
        });
        buttonOutput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldOutput.setText(String.valueOf(passengerTrain.getAmountOfPassengers()));
            }
        });

        buttonMethod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldMethod.setText(String.valueOf(passengerTrain.getTravelTime()));
            }
        });
        buttonTask2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PassengerTrain[] trains = new PassengerTrain[tableModel.getRowCount()];
                for (int row = 0; row < tableModel.getRowCount(); row++) {
                    trains[row] = new PassengerTrain(
                            String.valueOf(tableModel.getValueAt(row, 0)),
                            Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 1))),
                            new Time(String.valueOf(tableModel.getValueAt(row, 2))),
                            new Time(String.valueOf(tableModel.getValueAt(row, 3))),
                            Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 4)))
                    );
                }


                textFieldTask2.setText(Assignment4Part1.selectTrains(trains, textFieldDestinationCity.getText()));
            }
        });
    }

    private int getAmountOfPassengersFromInput() {
        var amountOfPassengers = textFieldInput.getText();
        try {
            return Integer.parseInt(amountOfPassengers);
        } catch (Exception exception) {
            return 0;
        }
    }

    private int getAmountOfPassengers() {
        var amountOfPassengers = textFieldAmountOfPassengers.getText();
        try {
            return Integer.parseInt(amountOfPassengers);
        } catch (Exception exception) {
            return 0;
        }
    }

    private Time getArrivalTime() {
        var arrivalTime = textFieldArrivalTime.getText();
        try {
            return new Time(arrivalTime);
        } catch (Exception exception) {
            return Time.getRandomTime();
        }
    }

    private Time getDepartureTime() {
        var departureTime = textFieldDepartureTime.getText();
        try {
            return new Time(departureTime);
        } catch (Exception exception) {
            return Time.getRandomTime();
        }
    }

    private int getTrainNumber() {
        var trainNumber = textFieldTrainNumber.getText();
        try {
            return Integer.parseInt(trainNumber);
        } catch (Exception exception) {
            return 0;
        }
    }

    private String getDestination() {
        return textFieldDestination.getText();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Assignment7Part1");
        frame.setContentPane(new Assignment7Part1().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Destination");
        tableModel.addColumn("Number of train");
        tableModel.addColumn("Departure time");
        tableModel.addColumn("Arrival time");
        tableModel.addColumn("Amount of passengers");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

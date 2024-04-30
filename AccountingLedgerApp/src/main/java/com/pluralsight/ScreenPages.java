package com.pluralsight;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ScreenPages {
    private Scanner userInput = new Scanner(System.in);
    //private Logger logger = new Logger("Error log.csv");

    public ScreenPages() {
        //homeScreen page
        while (true) {
            try {
                System.out.println("Welcome! Please choose a option from below using the numbers. ");
                System.out.println("-".repeat(40));
                System.out.println("1) Add Deposit");
                System.out.println("2) Make a payment");
                System.out.println("3) Ledger");
                System.out.println("4) Exit");
                System.out.println("Enter input: ");
                // For some reason registers this line as the input. Will keep it for now
                int choice = userInput.nextInt();

                switch (choice) {
                    case 1:
                        //make deposit
                        depositScreen();
                        break;
                    case 2:
                        //Make payment
                        makePaymentScreen();
                        break;
                    case 3:
                        //ledger
                        ledgerMainMenu();
                        break;
                    case 4:
                        //exit
                        System.out.println("Thanks for checking!");
                        return;
                }
            } catch (Exception ex) {
                System.out.println("Please enter a correct input");
            }
        }
    }

    public void depositScreen() {
        String filePath = "Files/transactions.csv";
        File file = new File((filePath));

        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            Scanner userInput = new Scanner(System.in);
            //date
            bufferedWriter.write(String.valueOf(LocalDate.now()));
            bufferedWriter.write("|");
            //time
            bufferedWriter.write(String.valueOf(LocalTime.now()));
            bufferedWriter.write("|");
            //description
            System.out.println("Please enter what it was for: ");
            String description = userInput.nextLine().strip();
            bufferedWriter.write(description);
            bufferedWriter.write("|");
            //vendor
            System.out.println("Please enter who deposited this amount: ");
            String vendor = userInput.nextLine().strip();
            bufferedWriter.write(vendor);
            bufferedWriter.write("|");
            //deposit
            System.out.println("Please enter amount deposited: ");
            double amount = userInput.nextDouble();
            bufferedWriter.write(String.valueOf(amount));
            bufferedWriter.newLine();
            System.out.println();
            System.out.println("Information recorded");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void makePaymentScreen() {
        String filePath = "Files/transactions.csv";
        File file = new File((filePath));

        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            Scanner userInput = new Scanner(System.in);
            //date
            bufferedWriter.write(String.valueOf(LocalDate.now()));
            bufferedWriter.write("|");
            //time
            bufferedWriter.write(String.valueOf(LocalTime.now()));
            bufferedWriter.write("|");
            //description
            System.out.println("Please enter what it was for: ");
            String description = userInput.nextLine().strip();
            bufferedWriter.write(description);
            bufferedWriter.write("|");
            //vendor being payed
            System.out.println("Please enter who your paying this amount to: ");
            String vendor = userInput.nextLine().strip();
            bufferedWriter.write(vendor);
            bufferedWriter.write("|");
            //deposit
            System.out.println("Please enter amount withdrawn: ");
            double amount = userInput.nextDouble();
            bufferedWriter.write(("-" + amount));
            bufferedWriter.newLine();
            System.out.println();
            System.out.println("Information recorded");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Ledger Menu
    public void ledgerMainMenu() {
        while (true) {
            try {
                System.out.println();
                System.out.println("Ledger main menu");
                System.out.println("-".repeat(40));
                System.out.println(" Please choose a option from below using the numbers. ");
                System.out.println("1) Show all info");
                System.out.println("2) Show deposits");
                System.out.println("3) Show payments");
                System.out.println("4) Report Screen");
                System.out.println("5) Return to home Screen");
                System.out.println("Enter input: ");
                // Same issue as line 173
                int choice = userInput.nextInt();

                switch (choice) {
                    case 1:
                        //all
                        allInfo();
                        break;
                    case 2:
                        //deposits
                        depositsLedger();
                        break;
                    case 3:
                        //payments
                        paymentsLedger();
                        break;
                    case 4:
                        //reports
                        reportsScreen();
                        break;
                    case 5:
                        //home
                        System.out.println("Returning to the Home screen");
                        return;
                }
            } catch (Exception ex) {
                System.out.println("Please enter a correct input");
            }
        }

    }

    //Screens from ledger Screen
    public void allInfo() {
        //need to read transaction.csv
        File file = new File("files/transactions.csv");
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
                System.out.println("------------------------------------------------------------------------");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void depositsLedger() {
        File file = new File("files/transactions.csv");


    }

    public void paymentsLedger() {
        File file = new File("files/transactions.csv");

    }

    //reports screen
    public void reportsScreen() {
        while (true) {
            try {
                System.out.println("Report main menu");
                System.out.println();
                System.out.println(" Please choose a option from below using the numbers: ");
                System.out.println("1) Month to date");
                System.out.println("2) previous months");
                System.out.println("3) Year to date");
                System.out.println("4) previous year");
                System.out.println("5) By vendor");
                System.out.println("6) Return to Ledger Screen");
                System.out.println("Enter input: ");
                // Same issue as line 173
                int choice = userInput.nextInt();

                switch (choice) {
                    case 1:
                        // month to date
                        monthToDateScreen();
                        break;
                    case 2:
                        //previous months
                        previousMonthScreen();
                        break;
                    case 3:
                        //year to date
                        yearToDateScreen();
                        break;
                    case 4:
                        //previous year
                        previousYearScreen();
                        break;
                    case 5:
                        //by vendor
                        byVendorScreen();
                    case 6:
                        //ledger page
                        System.out.println("Returning to the Ledger screen");
                        return;
                }
            } catch (Exception ex) {
                System.out.println("Please enter a correct input");

            }
        }
    }

    // reports screen
    public static void monthToDateScreen() {
        System.out.println("test");
    }

    public static void previousMonthScreen() {
        System.out.println("test");
    }

    public static void yearToDateScreen() {
        System.out.println("test");
    }

    public static void previousYearScreen() {
        System.out.println("test");
    }

    public static void byVendorScreen() {
        System.out.println("test");
    }

}
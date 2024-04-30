package com.pluralsight;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.logging.Logger;

public class ScreenPages {
    private Scanner userInput = new Scanner(System.in);
    //private Logger logger = new Logger("Error log.csv");

    //homeScreenVariables
    private String date = " ";
    private String time = " ";
    private String description = " ";
    private String vendor = " ";
    private Double amount;

    //Ledger variables
    private String fullList;
    private Double deposits;
    private Double payments;

    //Report Variables
    private String monthToDate;
    private String previousMonth;
    private String yearToDate;
    private String previousYear;
    private String byVendor;

    //homeScreenConstructor
    public ScreenPages(String date, String time, String description, String vendor, double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    //homeScreen getters and setters
    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public String getVendor() {
        return vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Ledger getter and setters
    public ScreenPages(String fullList, Double deposits, double payments) {
        this.fullList = fullList;
        this.deposits = deposits;
        this.payments = payments;
    }

    public String getFullList() {
        return fullList;
    }

    public Double getDeposits() {
        return deposits;
    }

    public double getPayments() {
        return payments;
    }

    public void setFullList(String fullList) {
        this.fullList = fullList;
    }

    public void setDeposits(Double deposits) {
        this.deposits = deposits;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }

    //Reports Constructor
    public ScreenPages(String monthToDate, String previousMonth, String yearToDate, String previousYear, String byVendor) {
        this.monthToDate = monthToDate;
        this.previousMonth = previousMonth;
        this.yearToDate = yearToDate;
        this.previousYear = previousYear;
        this.byVendor = byVendor;
    }

    //Reports Getter and Setters
    public String getMonthToDate() {
        return monthToDate;
    }

    public void setMonthToDate(String monthToDate) {
        this.monthToDate = monthToDate;
    }

    public String getPreviousMonth() {
        return previousMonth;
    }

    public void setPreviousMonth(String previousMonth) {
        this.previousMonth = previousMonth;
    }

    public String getYearToDate() {
        return yearToDate;
    }

    public void setYearToDate(String yearToDate) {
        this.yearToDate = yearToDate;
    }

    public String getPreviousYear() {
        return previousYear;
    }

    public void setPreviousYear(String previousYear) {
        this.previousYear = previousYear;
    }

    public String getByVendor() {
        return byVendor;
    }

    public void setByVendor(String byVendor) {
        this.byVendor = byVendor;
    }

    public ScreenPages() {
        //homeScreen page
        while (true) {
            try {
                System.out.println("Welcome! Please choose a option from below using the numbers. ");
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
            FileWriter writer = new FileWriter(file);
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
            userInput.next();
            bufferedWriter.write(getDescription());
            bufferedWriter.write("|");
            //who
            System.out.println("Please enter who deposited this amount: ");
            userInput.next();
            bufferedWriter.write(getVendor());
            bufferedWriter.write("|");
            //deposit
            System.out.println("Please enter amount deposited: ");
            userInput.nextDouble();
            bufferedWriter.write(String.valueOf(getAmount()));
            bufferedWriter.write("|");

            System.out.println();
            System.out.println("Information recorded");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void makePaymentScreen() {
        System.out.println("test");
    }

    //Ledger Menu
    public void ledgerMainMenu() {
        while (true) {
            try {
                System.out.println("Ledger main menu");
                System.out.println();
                System.out.println(" Please choose a option from below using the numbers. ");
                System.out.println("1) Add Deposit");
                System.out.println("2) Make a payment");
                System.out.println("3) Ledger");
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
        File file =new File("transactions.csv");
        try {
            Scanner fileScanner = new Scanner(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Displays all




        System.out.println("test");
    }

    public void depositsLedger() {
        System.out.println("test");
    }

    public void paymentsLedger() {
        System.out.println("test");
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
package com.pluralsight;

import java.util.Scanner;

public class ScreenPages {
    private Scanner userInput = new Scanner(System.in);
    //private Logger logger = new Logger();

    //homeScreenVariables
    private String date;
    private String time;
    private String description;
    private String vendor;
    private double amount;
    //Ledger variables
    private String fullList;
    private Double deposits;
    private double payments;
    //Report Variables

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

    public ScreenPages() {

        //homeScreen page
        while (true) {
            try {
                System.out.println("Welcome! Please choose a option from below using the numbers. ");
                System.out.println("1) Add Deposit");
                System.out.println("2) Make a payment");
                System.out.println("3) Ledger");
                System.out.println("4) Exit");
                userInput.nextInt();

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
        System.out.println("test");
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
                System.out.println(" Please choose a option from below using the numbers: ");
                userInput.nextInt();
                System.out.println("1) Add Deposit");
                System.out.println("2) Make a payment");
                System.out.println("3) Ledger");
                System.out.println("4) Exit");
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

    public void allInfo() {
        System.out.println("test");
    }

    public void depositsLedger() {
        System.out.println("test");
    }

    public void paymentsLedger() {
        System.out.println("test");
    }
}
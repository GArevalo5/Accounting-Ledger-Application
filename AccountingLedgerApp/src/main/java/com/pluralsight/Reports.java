package com.pluralsight;

public class Reports {
    //Variables for reports
    String monthToDate;
    String previousMonth;
    String yearToDate;
    String previousYear;
    String byVendor;
    //Reports Constructor
    public Reports(String monthToDate, String previousMonth, String yearToDate, String previousYear, String byVendor) {
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
    //reports screen
    public void reportsScreen{
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
                userInput.nextInt();
                int choice = userInput.nextInt();

                switch (choice) {
                    case 1:
                        // month to date
                        ;
                        break;
                    case 2:
                        //previous months
                        ;
                        break;
                    case 3:
                        //year to date
                        ;
                        break;
                    case 4:
                        //previous year

                        break;
                    case 5:
                        //ledger page
                        System.out.println("Returning to the Ledger screen");
                        return;
                }
            } catch (Exception ex) {
                System.out.println("Please enter a correct input");
            }
        }
    }
    public static void monthToDateScreen(){
        System.out.println("test");
    }
    public static void previousMonthScreen(){
        System.out.println("test");
    }
    public static void yearToDateScreen(){
        System.out.println("test");
    }
    public static void previousYearScreen(){
        System.out.println("test");
    }

}

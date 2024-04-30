package com.pluralsight;

public class PrivateVariablesAndGettersSetters {
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
    public PrivateVariablesAndGettersSetters(String date, String time, String description, String vendor, double amount) {
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
    public PrivateVariablesAndGettersSetters(String fullList, Double deposits, double payments) {
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
    public PrivateVariablesAndGettersSetters(String monthToDate, String previousMonth, String yearToDate, String previousYear, String byVendor) {
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
}

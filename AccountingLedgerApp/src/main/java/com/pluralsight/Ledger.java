package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ledger {
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

}

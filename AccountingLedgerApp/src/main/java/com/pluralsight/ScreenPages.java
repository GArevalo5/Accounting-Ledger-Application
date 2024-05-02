package com.pluralsight;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScreenPages {
    Scanner userInput = new Scanner(System.in);
    //private Logger logger = new Logger("Error log.csv");

    public ScreenPages() {
        //homeScreen page
        homeScreen();
    }

    public void homeScreen() {
        //homeScreen page
        Scanner userInput = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("---------Welcome!--------");
                System.out.println(
                                "    _/      Y      \\_\n" +
                                "   // ~~ ~~ | ~~ ~  \\\\\n" +
                                "  // ~ ~ ~~ | ~~~ ~~ \\\\      \n" +
                                " //________.|.________\\\\     \n" +
                                "`----------`-'----------'");

                System.out.println("Please choose a option from below using the numbers below!");
                System.out.println("-".repeat(60));
                System.out.println("1) Add Deposit");
                System.out.println("2) Make a payment");
                System.out.println("3) Ledger");
                System.out.println("4) Exit");
                System.out.print("Enter input: ");
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
                        System.exit(0);
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
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(LocalDate.now()));
            bufferedWriter.write("|");
            //time
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = currentTime.format(timeFormatter);
            bufferedWriter.write(formattedTime);
            bufferedWriter.write("|");
            //description
            System.out.print("Please enter what it was for: ");
            String description = userInput.nextLine().strip();
            bufferedWriter.write(description);
            bufferedWriter.write("|");
            //vendor
            System.out.print("Please enter who deposited this amount: ");
            String vendor = userInput.nextLine().strip();
            bufferedWriter.write(vendor);
            bufferedWriter.write("|");
            //deposit
            System.out.print("Please enter amount deposited: ");
            double amount = userInput.nextDouble();
            bufferedWriter.write(String.valueOf((amount)));
            bufferedWriter.close();
            System.out.println();
            System.out.println("Information recorded");
            System.out.println("(\\ \n" +
                    "\\'\\ \n" +
                    " \\'\\     __________  \n" +
                    " / '|   ()_________)\n" +
                    " \\ '/    \\ ~~~~~~~~ \\\n" +
                    "   \\       \\ ~~~~~~   \\\n" +
                    "   ==).      \\__________\\\n" +
                    "  (__)       ()__________)");
            System.out.println("-".repeat(40));

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
            bufferedWriter.newLine();
            //date
            bufferedWriter.write(String.valueOf(LocalDate.now()));
            bufferedWriter.write("|");
            //time
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = currentTime.format(timeFormatter);
            bufferedWriter.write(formattedTime);
            bufferedWriter.write("|");
            //description
            System.out.print("Please enter what it was for: ");
            String description = userInput.nextLine().strip();
            bufferedWriter.write(description);
            bufferedWriter.write("|");
            //vendor being payed
            System.out.print("Please enter who your paying this amount to: ");
            String vendor = userInput.nextLine().strip();
            bufferedWriter.write(vendor);
            bufferedWriter.write("|");
            //deposit
            System.out.print("Please enter amount withdrawn: ");
            double amount = userInput.nextDouble();
            bufferedWriter.write(("-" + amount));
            bufferedWriter.close();
            System.out.println();
            System.out.println("Information recorded");
            System.out.println("(\\ \n" +
                    "\\'\\ \n" +
                    " \\'\\     __________  \n" +
                    " / '|   ()_________)\n" +
                    " \\ '/    \\ ~~~~~~~~ \\\n" +
                    "   \\       \\ ~~~~~~   \\\n" +
                    "   ==).      \\__________\\\n" +
                    "  (__)       ()__________)");
            System.out.println("-".repeat(40));
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
                System.out.print("Enter input: ");
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
                        homeScreen();
                }
            } catch (Exception ex) {
                System.out.println("Please enter a correct input\n"+ "       _......._\n" +
                        "       .-'.'.'.'.'.'.`-.\n" +
                        "     .'.'.'.'.'.'.'.'.'.`.\n" +
                        "    /.'.'               '.\\\n" +
                        "    |.'    _.--...--._     |\n" +
                        "    \\    `._.-.....-._.'   /\n" +
                        "    |     _..- .-. -.._   |\n" +
                        " .-.'    `.   ((@))  .'   '.-.\n" +
                        "( ^ \\      `--.   .-'     / ^ )\n" +
                        " \\  /         .   .       \\  /\n" +
                        " /          .'     '.  .-    \\\n" +
                        "( _.\\    \\ (_`-._.-'_)    /._\\)\n" +
                        " `-' \\   ' .--.          / `-'\n" +
                        "     |  / /|_| `-._.'\\   |\n" +
                        "     |   |       |_| |   /-.._\n" +
                        " _..-\\   `.--.______.'  |\n" +
                        "      \\       .....     |\n" +
                        "       `.  .'      `.  /\n" +
                        "         \\           .'\n" +
                        "  ...     `-..___..-`");
            }
        }

    }

    //Screens from ledger menu
    public void allInfo() {
        //need to read transaction.csv
        File file = new File("files/transactions.csv");
        try {
            Scanner fileScanner = new Scanner(file);
            System.out.println("    __...--~~~~~-._   _.-~~~~~--...__\n" +
                    "    //               `V'               \\\\ \n" +
                    "   //                 |                 \\\\ \n" +
                    "  //__...--~~~~~~-._  |  _.-~~~~~~--...__\\\\ \n" +
                    " //__.....----~~~~._\\ | /_.~~~~----.....__\\\\\n" +
                    "====================\\\\|//====================\n" +
                    "                 `---`");
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
                System.out.println("------------------------------------------------------------------------");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Please enter a correct input");
            throw new RuntimeException(e);
        }
    }

    public void depositsLedger() {
        File file = new File("files/transactions.csv");
        //checks the deposits on the csv and sees if the amounts are bigger than zero to print.
        try {
            Scanner fileScanner = new Scanner(file);
            System.out.println("    __...--~~~~~-._   _.-~~~~~--...__\n" +
                    "    //               `V'               \\\\ \n" +
                    "   //                 |                 \\\\ \n" +
                    "  //__...--~~~~~~-._  |  _.-~~~~~~--...__\\\\ \n" +
                    " //__.....----~~~~._\\ | /_.~~~~----.....__\\\\\n" +
                    "====================\\\\|//====================\n" +
                    "                 `---`");
            fileScanner.nextLine();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] deposits = line.split("\\|");
                double rows = Double.parseDouble(deposits[4].trim());
                if (rows > 0) {
                    System.out.println(line);
                    System.out.println("------------------------------------------------------------------------");
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Please enter a correct input");
            throw new RuntimeException(e);
        }

    }

    public void paymentsLedger() {
        File file = new File("files/transactions.csv");
        //checks to see if it's less than zero and prints those out
        try {
            Scanner fileScanner = new Scanner(file);
            System.out.println("    __...--~~~~~-._   _.-~~~~~--...__\n" +
                    "    //               `V'               \\\\ \n" +
                    "   //                 |                 \\\\ \n" +
                    "  //__...--~~~~~~-._  |  _.-~~~~~~--...__\\\\ \n" +
                    " //__.....----~~~~._\\ | /_.~~~~----.....__\\\\\n" +
                    "====================\\\\|//====================\n" +
                    "                 `---`");
            fileScanner.nextLine();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] deposits = line.split("\\|");
                double rows = Double.parseDouble(deposits[4].trim());
                if (rows < 0) {
                    System.out.println(line);
                    System.out.println("------------------------------------------------------------------------");
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //reports menu
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
                System.out.println("7) Home Screen");
                System.out.print("Enter input: ");
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
                        break;
                    case 6:
                        //ledger page
                        System.out.println("Returning to the Ledger screen");
                        return;
                    case 7:
                        System.out.println("Returning to the home screen.");
                        homeScreen();
                }
            } catch (Exception ex) {
                System.out.println("Please enter a correct input");

            }
        }
    }

    // report options
    public static void monthToDateScreen() {
        System.out.println();
        try {
            String filePath = "Files/transactions.csv";
            File file = new File((filePath));
            Scanner fileScanner = new Scanner(file);

            //check local date
            LocalDate today = LocalDate.now();
            Month month = today.getMonth();
            int currentYear = today.getYear();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            //Stop the header from being added
            fileScanner.nextLine();
            //search file for current month/day/year.
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\|");
                String date = parts[0];
                LocalDate monthToDate = LocalDate.parse(date, formatter);
                //prints out All transactions of the month
                if (monthToDate.getMonth() == month && monthToDate.getYear() == currentYear) {
                    System.out.println("Month to date");
                    System.out.println("-".repeat(60));
                    System.out.println("Date: " + date);
                    System.out.println("Time: " + parts[1]);
                    System.out.println("Description: " + parts[2]);
                    System.out.println("Vendor: " + parts[3]);
                    System.out.println("Amount: " + parts[4]);
                    System.out.println("-".repeat(60));
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Please enter a correct input");
            throw new RuntimeException(e);
        }
    }

    public static void previousMonthScreen() {
        try {
            String filePath = "Files/transactions.csv";
            File file = new File((filePath));
            Scanner fileScanner = new Scanner(file);

            //check local date and subtracts it by 1 month
            LocalDate today = LocalDate.now();
            LocalDate previousMonth = today.minusMonths(1);
            Month month = previousMonth.getMonth();
            int currentYear = previousMonth.getYear();
            //formats so it can search for the correct date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            //Stop the header from being added
            fileScanner.nextLine();
            //search file for previous month transactions and print it out.
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\|");
                String date = parts[0].trim();
                LocalDate monthToDate = LocalDate.parse(date, formatter);
                if (monthToDate.getMonth().equals(month) && monthToDate.getYear() == currentYear) {
                    System.out.println("Transactions from the previous month");
                    System.out.println("-".repeat(60));
                    System.out.println("Date: " + date);
                    System.out.println("Time: " + parts[1]);
                    System.out.println("Description: " + parts[2]);
                    System.out.println("Vendor: " + parts[3]);
                    System.out.println("Amount: " + parts[4]);
                    System.out.println("-".repeat(60));
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void yearToDateScreen() {
        System.out.println();
        try {
            String filePath = "Files/transactions.csv";
            File file = new File((filePath));
            Scanner fileScanner = new Scanner(file);

            //check local date
            LocalDate today = LocalDate.now();
            int currentYear = today.getYear();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            //Stop the header from being added
            fileScanner.nextLine();
            //search file for current month/day/year
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\|");
                String date = parts[0];
                LocalDate yearToDate = LocalDate.parse(date, formatter);
                //Prints out transactions for the year.
                if (yearToDate.getYear() == currentYear) {
                    System.out.println("Year to date");
                    System.out.println("-".repeat(60));
                    System.out.println("Date: " + date);
                    System.out.println("Time: " + parts[1]);
                    System.out.println("Description: " + parts[2]);
                    System.out.println("Vendor: " + parts[3]);
                    System.out.println("Amount: " + parts[4]);
                    System.out.println("-".repeat(60));
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void previousYearScreen() {
        try {
            String filePath = "Files/transactions.csv";
            File file = new File((filePath));
            Scanner fileScanner = new Scanner(file);

            //check local date along and subtracts by 1 year
            LocalDate today = LocalDate.now();
            LocalDate previousYear = today.minusYears(1);
            int currentYear = previousYear.getYear();
            //formats so it can search for the correct date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            //Stop the header from being added
            fileScanner.nextLine();
            //search file for previous year transactions and print it outs.
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\|");
                String date = parts[0];
                LocalDate monthToDate = LocalDate.parse(date, formatter);
                if (monthToDate.getYear() == currentYear) {
                    System.out.println("Transactions from the previous year");
                    System.out.println("-".repeat(60));
                    System.out.println("Date: " + date);
                    System.out.println("Time: " + parts[1]);
                    System.out.println("Description: " + parts[2]);
                    System.out.println("Vendor: " + parts[3]);
                    System.out.println("Amount: " + parts[4]);
                    System.out.println("-".repeat(60));
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void byVendorScreen() {
        String filePath = "Files/transactions.csv";
        File file = new File((filePath));

        try {
            Scanner fileScanner = new Scanner(file);
            Scanner userInput = new Scanner(System.in);
            fileScanner.nextLine();
            System.out.print("Please enter the vendor you are looking for: ");
            String vendor = userInput.next().strip();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] vendorSearch = line.split("\\|");
                if (vendorSearch.length >= 4 && vendorSearch[3].equalsIgnoreCase(vendor)) {
                    // Displays all transactions of the vendor the user inputted
                    System.out.println("Transactions with vendor found!");
                    System.out.println("-".repeat(60));
                    System.out.println("Date: " + vendorSearch[0]);
                    System.out.println("Time: " + vendorSearch[1]);
                    System.out.println("Description: " + vendorSearch[2]);
                    System.out.println("Vendor: " + vendorSearch[3]);
                    System.out.println("Amount: " + vendorSearch[4]);
                    System.out.println("-".repeat(60));
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}



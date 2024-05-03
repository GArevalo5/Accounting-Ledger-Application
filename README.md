# Accounting-Ledger-Application
A capstone project that tracks all financial transactions for business or personal use. This application has 3 main screens. 
Home,Ledger and reports. Home Screen allows you to go to deposit or add payments you made into the cvs file. Can also go to the ledger screen. 
Home screen also has the option to exit the app and end it. 

Ledger screen has 4 options. All which displays everything in the csv file, deposits which shows only things put in from the deposit screen, payments which only shows payments put in from the payment screen. Ledger screen also is the only way to get to the reports screen. 

The reports screen is meant run pre-defined reports or run a custom search by vendor. The options on the reports screen are: Month to date which checks from current month, previous month which check transactions from the previous month, year to date which checks all transactions of the current year, previous year which checks and displays transaction of the previous years, Search by vendor allows you to search for the vendor and displays all transactions from that vendor. It can also go back to the ledger screen or the home screen.

4-29-24
Started out with first drawing out the screens I would need(see picture below).
![alt text](<whiteboard pic.jpg>)
Once starting on the project I started setting up for the "Home Screen" first. I would set up all in the 
"ScreenPage.java". Once I finished getting all the screens working for the "homeScreen" I would setup another class
to space out the other screens I would need which was for the "Ledger" and the "Reports" screens. Since I already did the work for the home screen,
I copy and pasted the code from the "homeScreen" to setup "ledgerScreen" and "reportsScreen" More easily. Did have a issue with the user input being asked twice ,but was resolved by leaving it as "int choices = userinput.nextint()". Not sure if the best way to do it ,but works perfectly in the time of writing.

update 4-30-24
Home screen options all work as intended. Deposit and payment options will input correctly into the "transaction.csv" file. Once I got the deposit working I just copied and pasted the functions of that into the payment since it was the same thing ,but changed the text of what it would ask the user along with making sure it displayed it as a negative when it was a payment. 
deposit and payment screens below:
![alt text](depositScreenPic.jpg)
![alt text](paymentScreenPic.jpg)
Currently still working on making all of the ledger options are working. So far only being to view all info is the only thing working.
Did move some things out of the "ScreenPages.java" class for the moment just because it felt cluttered.
known bugs or errors 4-30-24: N/A

5-1-24 update
Ledger and home screen both work now. Ledger now displays All info, Just the deposits and just the payments. Had to fix little minor issues because I didn't realize it was having errors because of it trying to display the header in the csv file. Luckily that's been resolved.Finished the last of the screens. Updated the depsoit and payment screens so that time would be formatted as HH:mm:ss because it made everything look werid on the other screens when display anything in the csv file.
This is how I did my monthToDateScreen along with yearToDateScreen. Used the same code more or less with both. Diffrence just setting it so one looked for month and the other is year.

Month to date photos below:
![alt text](monthToDate1.jpg)![alt text](monthToDate2.jpg)
Year to date photos below
![alt text](yearToDate1.jpg)![alt text](yearToDate2.jpg)

The vendor screen which asks the user for the vendor and finds all transactions in the csv that matches the vendors name, was the most challengeing to do. The other screens were just printing things that the user wanted to see while this needed the user to actually input something into it. At the time of writing, I was struggling alot on how to the file reader to search for what was inputted and then print it out.

vendor screen below:
![alt text](vendorScreen.jpg)
Known bugs or errors 5-1-24: N/A

5-2-24
Home Screen finished, Ledger Screen finished and Reports screen are finished. fixing minor things like making user input on the same line it's being asked,testing to make sure all lines of code work as intended and fixing where it's not, fixed a issue where the app wouldn't close if went from the reports or ledger screen to the home screen because the exit button was a return. So looked up how to close it right and switched "return" to "System.exit(0)" which fixed that problem. Don't think I'm going to finish one part of it to make sure the csv file to organize the lists in the csv file by date ,but it works and will fill out as intended. Added a few things to also make it look alittle nice.

known bugs or errors: 
-Deposit and payment making a extra blank line in the csv file after entering user information.Found 9:30AM (fixed 5-2-24 10:33AM)
-on the main screens if you enter something other than a number to go to another screen, It'll get mad and start repeating the screen over and over again. found 11:50pm

5-3-24
bugs or errors: -Will break if csv file has a blank space or a extra line (Soultion: if for some reason a space is left just delete from the csv file. Know not the best soultion ,but is what works for it).

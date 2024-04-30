# Accounting-Ledger-Application
A capstone project that tracks all financial transactions for business or personal use.

4-29-24
Started out with first drawing out the screens I would need(see picture below).
![alt text](<whiteboard pic.jpg>)
Once starting on the project I started setting up for the "Home Screen" first. I would set up all in the 
"ScreenPage.java". Once I finished getting all the screens working for the "homeScreen" I would setup another class
to space out the other screens I would need which was for the "Ledger" and the "Reports" screens. Since I already did the work for the home screen,
I copy and pasted the code from the "homeScreen" to setup "ledgerScreen" and "reportsScreen" More easily. Did have a issue with the user input being asked twice ,but was resolved by leaving it as "int choices = userinput.nextint()". Not sure if the best way to do it ,but works perfectly in the time of writing.

update 4-30-24
Home screen options all work as intended. Deposit and payment options will input correctly into the "transaction.csv" file. Once I got the deposit working I just copied and pasted the functions of that into the payment since it was the same thing ,but changed the text of what it would ask the user along with making sure it displayed it as a negative when it was a payment. 
![alt text](depositScreenPic.jpg)
![alt text](paymentScreenPic.jpg)
Currently still working on making all of the ledger options are working. So far only being to view all info is the only thing working.
Did move some things out of the "ScreenPages.java" class for the moment just because it felt cluttered.

known bugs or errors: N/A 4-30-24
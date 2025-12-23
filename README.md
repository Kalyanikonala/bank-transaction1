Project Description
This project is a Bank Transactions System developed using Java and Packages in Visual Studio Code.
It performs basic banking operations such as Deposit, Withdraw, and Payment with support for Rupees and Dollars, including currency conversion, PIN validation, and balance updates after every transaction.
Package Structure
p1 – Bank
Contains the Main class
Controls program execution
Displays menu and handles user input
Calls methods from other packages
p2 – Transaction (Interface)
Defines abstract methods:
deposit()
withdraw()
payment()
Provides abstraction for bank transactions
p3 – Rupees & Dollars
Handles transactions in:
Rupees
Dollars
Performs currency conversion between Rupees and Dollars
Allows transactions using either currency
p4 – Check & Balance
Check:
Validates user PIN before transactions
Balance:
Displays balance after every transaction
How to Run in VS Code
1. Install Visual Studio Code
2. Install Java Extension Pack
3. Open project folder in VS Code
4. Ensure all packages (p1, p2, p3, p4) are present
5. Open Main class from package p1
6. Click Run or use terminal:
javac p1/Bank.java
java p1.Bank
7. Follow menu options to perform transactions
Learning Outcomes
Understanding Java package structure
Interface implementation in real-time applications
Currency conversion logic
Secure transaction handling using PIN validation
Practical use of OOP concepts in Java

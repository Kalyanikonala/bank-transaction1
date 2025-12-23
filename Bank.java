package p1;

import java.util.Scanner;
import p2.Transaction;   // Importing interface
import p3.Currency;     // Importing Currency class
import p4.Check;        // Importing Check class

public class Bank implements Transaction {
    private Check check;

    // Constructor with initial balance
    public Bank(double initialBalance) {
        check = new Check(initialBalance);
    }

    // Implementing deposit method
    @Override
    public void deposit(double amount) {
        double newBalance = check.getBalance() + amount;
        check.updateBalance(newBalance);
        System.out.println("Deposited: " + amount + " | Balance: " + newBalance);
    }

    // Implementing withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount <= check.getBalance()) {
            double newBalance = check.getBalance() - amount;
            check.updateBalance(newBalance);
            System.out.println("Withdrawn: " + amount + " | Balance: " + newBalance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Implementing payment method
    @Override
    public void payment(double amount) {
        if (amount <= check.getBalance()) {
            double newBalance = check.getBalance() - amount;
            check.updateBalance(newBalance);
            System.out.println("Payment of " + amount + " successful | Balance: " + newBalance);
        } else {
            System.out.println("Payment Failed! Insufficient Balance.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(10000); // Initial Balance ₹10,000

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (!bank.check.validatePin(pin)) {
            System.out.println("Invalid PIN! Access Denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Payment");
            System.out.println("4. Convert Rupees to Dollars");
            System.out.println("5. Convert Dollars to Rupees");
            System.out.println("6. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    bank.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    bank.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter payment amount: ");
                    bank.payment(sc.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter Rupees: ");
                    double rupees = sc.nextDouble();
                    System.out.println("Converted to Dollars: " + Currency.rupeesToDollars(rupees));
                    break;
                case 5:
                    System.out.print("Enter Dollars: ");
                    double dollars = sc.nextDouble();
                    System.out.println("Converted to Rupees: " + Currency.dollarsToRupees(dollars));
                    break;
                case 6:
                    System.out.println("Current Balance: " + bank.check.getBalance());
                    break;
                case 0:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}



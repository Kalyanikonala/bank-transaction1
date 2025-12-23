package p4;

public class Check {
    private static final int PIN = 1234; // fixed PIN for demo
    private double balance;

    public Check(double balance) {
        this.balance = balance;
    }

    // Pin Validation
    public boolean validatePin(int enteredPin) {
        return enteredPin == PIN;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Update balance
    public void updateBalance(double newBalance) {
        this.balance = newBalance;
    }
}

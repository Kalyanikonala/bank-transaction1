package p2;


public interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
    void payment(double amount);
}


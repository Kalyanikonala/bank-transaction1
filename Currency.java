package p3;

public class Currency {
    // Convert Rupees to Dollars (assume 1 USD = 80 INR)
    public static double rupeesToDollars(double rupees) {
        return rupees / 80.0;
    }

    // Convert Dollars to Rupees
    public static double dollarsToRupees(double dollars) {
        return dollars * 80.0;
    }
}

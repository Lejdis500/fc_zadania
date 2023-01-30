package Lesson4Task6;

public class BillCalculator {
    public static double calculate(double bill, float serviceCharge) {
        return bill + serviceCharge;
    }

    public static double calculate(double bill, float serviceCharge, double discount) {
        return bill * (1 - discount) + serviceCharge;
    }

    public static double calculate(double bill, float seriveCharge, short takeoutCharge) {
        return bill + seriveCharge + takeoutCharge;
    }
}
package Lesson4Task6;

public class Main {
    public static void main(String[] args) {
        double bill = 500.0d;
        float serviceCharge = 20.0f;
        double total = BillCalculator.calculate(bill, serviceCharge);
        System.out.println(" Wartość rachunku:" + total);
        double discount = 0.5;
        total = BillCalculator.calculate(bill, serviceCharge);
        System.out.println("Wartość rachunku z zniżką:" + total);
        short takeoutCharge = 5;
        total = BillCalculator.calculate(bill, serviceCharge, takeoutCharge);
        System.out.println("Wartość rachunku z opłatą za opakowania na wynos:" + total);
    }
}
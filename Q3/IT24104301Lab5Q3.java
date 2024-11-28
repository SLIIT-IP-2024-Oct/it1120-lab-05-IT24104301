import java.util.Scanner;

public class IT24104301Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startDate, endDate;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date.");
            return;
        }

        final double perDayCharges = 48000;
        final double threeToFourDaysDiscount = 0.1;
        final double fiveOrMoreDaysDiscount = 0.2;

        int daysReserved = endDate - startDate;

        double discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = threeToFourDaysDiscount;
        } else if (daysReserved >= 5) {
            discountRate = fiveOrMoreDaysDiscount;
        }

        double totalAmountWithoutDiscount = perDayCharges * daysReserved;
        double discount = discountRate * totalAmountWithoutDiscount;
        double totalAmount = totalAmountWithoutDiscount - discount;

        System.out.println();
        System.out.println("Room Charge per Day: Rs. " + perDayCharges + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.printf("Discount Applied: %.2f%%\n", discountRate * 100);
        System.out.println("Total Amount Before Discount: Rs. " + totalAmountWithoutDiscount + "/=");
        System.out.println("Discount Amount: Rs. " + discount + "/=");
        System.out.println("Total Amount to be Paid: Rs. " + totalAmount + "/=");
    }
}

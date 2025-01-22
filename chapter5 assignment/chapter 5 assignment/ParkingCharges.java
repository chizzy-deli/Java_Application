import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCharges = 0;

        while (true) {
            System.out.print("Enter the hours parked (or -1 to stop): ");
            double hours = scanner.nextDouble();
            
            if (hours == -1) {
                break;
            }

            double charge = calculateCharges(hours);
            totalCharges += charge;

            System.out.printf("Charge for this customer: $%.2f%n", charge);
            System.out.printf("Running total of charges: $%.2f%n", totalCharges);
        }

        scanner.close();
    }

    public static double calculateCharges(double hours) {
        if (hours <= 3) {
            return 2.00; // Minimum fee for up to 3 hours
        } else {
            double additionalHours = Math.ceil(hours - 3);
            double charge = 2.00 + additionalHours * 0.50;
            return Math.min(charge, 10.00); // Maximum charge is $10.00
        }
    }
}

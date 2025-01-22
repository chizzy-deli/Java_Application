import java.util.Scanner;

public class RoundingDecimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or type 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            double number = Double.parseDouble(input);
            System.out.printf("Original number: %.4f%n", number);
            System.out.printf("Rounded to nearest integer: %d%n", roundToInteger(number));
            System.out.printf("Rounded to nearest tenth: %.1f%n", roundToTenths(number));
            System.out.printf("Rounded to nearest hundredth: %.2f%n", roundToHundredths(number));
            System.out.printf("Rounded to nearest thousandth: %.3f%n", roundToThousandths(number));
        }

        scanner.close();
    }

    public static int roundToInteger(double number) {
        return (int) Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or type 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            double number = Double.parseDouble(input);
            int rounded = (int) Math.floor(number + 0.5);

            System.out.printf("Original number: %.2f, Rounded number: %d%n", number, rounded);
        }

        scanner.close();
    }
}
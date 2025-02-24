
package chapter11assignment.assignment;

public class Slip {

    public static void main(String[] args) {
        try {
            methodWithTryBlock();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in main: " + e);
        }
    }

    // Method with its own try block
    public static void methodWithTryBlock() {
        try {
            System.out.println("Inside methodWithTryBlock");

            // Generate an ArithmeticException (handled within the method)
            int result = 10 / 0;  // This will throw ArithmeticException

            // Generate an ArrayIndexOutOfBoundsException (not handled in this method)
            int[] arr = new int[2];
            System.out.println(arr[5]);  // This will throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in methodWithTryBlock: " + e);
            // Only ArithmeticException is caught here
        }
        // ArrayIndexOutOfBoundsException will slip through and be caught by the main method
    }
}

}

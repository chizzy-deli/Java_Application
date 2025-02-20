
package assignment.chapter8;


public class TestRectangle {
    public static void main(String[] args) {
        // Create a new Rectangle object using the default constructor
        Rectangle rectangle = new Rectangle();

        // Output the initial default values (length and width)
        System.out.println("Initial Rectangle Dimensions:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // Set valid length and width values
        rectangle.setLength(10.0);
        rectangle.setWidth(5.0);

        // Output the updated values after setting length and width
        System.out.println("\nUpdated Rectangle Dimensions:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // Try setting invalid values
        rectangle.setLength(25.0);  // Should give an error message
        rectangle.setWidth(-5.0);   // Should give an error message
    }
}


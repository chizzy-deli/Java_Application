
package assignment.chapter8;


public class Rectangle {
    public class Rectangle {
    // Private instance variables for length and width, default values are 1.0
    private double length = 1.0;
    private double width = 1.0;

    // Constructor to initialize rectangle with default values
    public Rectangle() {
    }

    // Setter for length with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Error: Length must be between 0.0 and 20.0.");
        }
    }

    // Setter for width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Error: Width must be between 0.0 and 20.0.");
        }
    }

    // Getter for length
    public double getLength() {
        return this.length;
    }

    // Getter for width
    public double getWidth() {
        return this.width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return this.length * this.width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
}

    
}

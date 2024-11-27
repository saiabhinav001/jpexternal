// Unit-1 6th program

class Rectangle1 {
    double length;
    double width;

    // Default constructor
    Rectangle1() {
        length = 1.0; // Default length
        width = 1.0;  // Default width
    }

    // Parameterized constructor
    Rectangle1(double length, double width) {
        this.length = length; // Assign length
        this.width = width;   // Assign width
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }

    // Method to display dimensions
    void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Using the default constructor
        Rectangle1 rect1 = new Rectangle1();
        System.out.println("Rectangle1 1 (Default Constructor):");
        rect1.displayDimensions();
        System.out.println("Area: " + rect1.calculateArea());

        // Using the parameterized constructor
        Rectangle1 rect2 = new Rectangle1(5.0, 3.5);
        System.out.println("\nRectangle1 2 (Parameterized Constructor):");
        rect2.displayDimensions();
        System.out.println("Area: " + rect2.calculateArea());
    }
}

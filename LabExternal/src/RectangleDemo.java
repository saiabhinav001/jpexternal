//Unit-1 5th question

// Class to represent a rectangle
class Rectangle {
    // Instance variables
    double length;
    double width;

    // Method to calculate the area of the rectangle
    double calculateArea() {
        return length * width;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        // Create the first object of the Rectangle1 class
        Rectangle1 rect1 = new Rectangle1();
        rect1.length = 5.0;  // Accessing and setting instance variable
        rect1.width = 3.0;
        System.out.println("Area of Rectangle1 1: " + rect1.calculateArea());

        // Create the second object of the Rectangle1 class
        Rectangle1 rect2 = new Rectangle1();
        rect2.length = 7.0;  // Accessing and setting instance variable
        rect2.width = 4.5;
        System.out.println("Area of Rectangle1 2: " + rect2.calculateArea());
    }
}

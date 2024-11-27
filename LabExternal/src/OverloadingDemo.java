// Unit-1 7th program

class Calculator {
    // Constructor overloading
    Calculator() {
        System.out.println("Default Constructor: Calculator initialized with no arguments.");
    }

    Calculator(int a, int b) {
        System.out.println("Parameterized Constructor: Calculator initialized with values " + a + " and " + b + ".");
    }

    // Method overloading: Adding two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: Adding three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method: Adding two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        // Demonstrating constructor overloading
        Calculator calc1 = new Calculator();        // Default constructor
        Calculator calc2 = new Calculator(10, 20); // Parameterized constructor

        // Demonstrating method overloading
        System.out.println("Addition of two integers: " + calc1.add(5, 10));
        System.out.println("Addition of three integers: " + calc1.add(5, 10, 15));
        System.out.println("Addition of two doubles: " + calc1.add(5.5, 4.5));
    }
}

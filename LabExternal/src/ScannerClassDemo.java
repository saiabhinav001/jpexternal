import java.util.Scanner;

public class ScannerClassDemo {
    public static void main(String[] args) {
        // 1. Command-line arguments
        if (args.length > 0) {
            System.out.println("Command-line argument received: " + args[0]);
        } else {
            System.out.println("No command-line argument received.");
        }

        // 2. Using Scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Using Wrapper class to convert int to Integer
        Integer wrappedNum = Integer.valueOf(num);

        // Reading a double
        System.out.print("Enter a double: ");
        double d = scanner.nextDouble();

        // Using Wrapper class to convert double to Double
        Double wrappedDouble = Double.valueOf(d);

        // Displaying the values using Wrapper classes
        System.out.println("Integer value: " + wrappedNum);
        System.out.println("Double value: " + wrappedDouble);

        scanner.close();
    }
}

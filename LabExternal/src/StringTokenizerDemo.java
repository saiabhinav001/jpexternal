import java.util.StringTokenizer;
import java.util.Scanner;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a line of integers
        System.out.println("Enter a line of integers separated by spaces:");
        String line = scanner.nextLine();

        // Using StringTokenizer to tokenize the input
        StringTokenizer tokenizer = new StringTokenizer(line);

        int sum = 0; // Variable to store the sum

        System.out.println("The integers are:");
        while (tokenizer.hasMoreTokens()) {
            // Parse each token as an integer
            int number = Integer.parseInt(tokenizer.nextToken());
            System.out.println(number); // Display each integer
            sum += number; // Add to the sum
        }

        // Display the sum of the integers
        System.out.println("Sum of the integers: " + sum);

        scanner.close();
    }
}

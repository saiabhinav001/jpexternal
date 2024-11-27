import java.io.IOException;

public class ThrowsExample {

    // Method that declares an exception using "throws"
    public static void riskyMethod() throws IOException {
        System.out.println("Inside riskyMethod...");
        throw new IOException("Simulated IOException");
    }

    public static void main(String[] args) {
        try {
            // Calling the method that might throw an exception
            riskyMethod();
        } catch (IOException e) {
            // Handling the exception
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

// User-defined exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    // Method to validate age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to proceed.");
        } else {
            System.out.println("Age is valid. You may proceed.");
        }
    }

    public static void main(String[] args) {
        int userAge = 16; // Example age

        try {
            // Validate user age
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}


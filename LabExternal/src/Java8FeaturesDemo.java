import java.util.function.Consumer;

// Custom functional interface
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class Java8FeaturesDemo {
    public static void main(String[] args) {
        // a) Lambda Expressions
        Greeting greetLambda = (name) -> System.out.println("Hello, " + name + "!");
        greetLambda.sayHello("SAI ABHINAV");

        // b) Method References
        Consumer<String> methodRef = System.out::println;
        methodRef.accept("This is an example of a method reference.");

        // Using a method reference with a custom method
        Greeting greetMethodRef = Java8FeaturesDemo::customGreeting;
        greetMethodRef.sayHello("SAI ABHINAV");

        // c) Using Functional Interfaces
        Consumer<String> consumerLambda = message -> System.out.println("Processing message: " + message);
        consumerLambda.accept("Lambda with Consumer functional interface.");

        // Combining functional interface, lambda, and method reference
        performOperation("Hello from Java 8!", System.out::println);
    }

    // Custom method for method reference
    public static void customGreeting(String name) {
        System.out.println("Greetings, " + name + "!");
    }

    // Generic method for functional interface demonstration
    public static void performOperation(String input, Consumer<String> operation) {
        operation.accept(input);
    }
}

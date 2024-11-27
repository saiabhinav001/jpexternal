// Final class cannot be subclassed
final class Animal {
    // Final variable cannot be modified
    final String species = "Mammal";

    // Final method cannot be overridden
    final void sound() {
        System.out.println("The animal makes a sound.");
    }
}

// Attempting to inherit from a final class will result in a compile-time error
// class Dog extends Animal { // This will cause an error
//     void sound() {   // Cannot override the final method
//         System.out.println("The dog barks.");
//     }
// }

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Creating an object of the final class
        Animal animal = new Animal();

        // Using the final variable
        System.out.println("Species: " + animal.species);

        // Calling the final method
        animal.sound();
    }
}

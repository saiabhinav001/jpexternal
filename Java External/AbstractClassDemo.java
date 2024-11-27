// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Regular method (can have implementation)
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Concrete class inheriting from abstract class
class Dog extends Animal {
    // Providing implementation of the abstract method
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

// Concrete class inheriting from abstract class
class Cat extends Animal {
    // Providing implementation of the abstract method
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat class
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling the implemented methods
        dog.sound(); // Calls Dog's implementation of sound()
        dog.sleep(); // Calls Animal's implementation of sleep()

        cat.sound(); // Calls Cat's implementation of sound()
        cat.sleep(); // Calls Animal's implementation of sleep()
    }
}

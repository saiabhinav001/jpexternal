// Parent class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        // Parent class reference pointing to a parent object
        Animal animal;

        // Parent class reference pointing to a Dog object
        animal = new Dog();
        animal.sound(); // Calls Dog's overridden sound() method

        // Parent class reference pointing to a Cat object
        animal = new Cat();
        animal.sound(); // Calls Cat's overridden sound() method
    }
}

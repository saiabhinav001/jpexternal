// Parent class
class Animal {
    String name = "Generic Animal";

    Animal() {
        System.out.println("Animal constructor called.");
    }

    void displayInfo() {
        System.out.println("This is an animal.");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    Dog() {
        this("Golden Retriever"); // Calls the parameterized constructor of this class
        System.out.println("Default Dog constructor called.");
    }

    Dog(String breed) {
        super(); // Calls the parent class constructor
        System.out.println("Dog constructor with breed: " + breed);
    }

    void displayNames() {
        System.out.println("Child class name: " + this.name);
        System.out.println("Parent class name: " + super.name);
    }

    void displayInfo() {
        super.displayInfo(); // Calls the parent class method
        System.out.println("This is a dog.");
    }
}

// Main class
public class SuperDemo {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Creates a Dog object
        dog.displayNames();  // Accesses names using super and this
        dog.displayInfo();   // Calls methods using super and this
    }
}

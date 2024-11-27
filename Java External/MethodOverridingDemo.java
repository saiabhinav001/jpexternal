// Parent class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

// Child class 1
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Parent class reference with parent class object
        Animal animal = new Animal();
        animal.sound(); // Calls parent class method

        // Parent class reference with child class objects
        Animal dog = new Dog();
        dog.sound(); // Calls overridden method in Dog class

        Animal cat = new Cat();
        cat.sound(); // Calls overridden method in Cat class
    }
}

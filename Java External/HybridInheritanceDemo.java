// Interface 1
interface Animal {
    void sound();
}

// Interface 2
interface Mammal {
    void walk();
}

// Base class (Single inheritance)
class Dog {
    void displayInfo() {
        System.out.println("This is a dog.");
    }
}

// Derived class implementing both interfaces and inheriting from Dog class (Hybrid inheritance)
class Labrador extends Dog implements Animal, Mammal {
    // Implementing the sound method from Animal interface
    @Override
    public void sound() {
        System.out.println("The Labrador barks.");
    }

    // Implementing the walk method from Mammal interface
    @Override
    public void walk() {
        System.out.println("The Labrador walks on land.");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of the Labrador class
        Labrador labrador = new Labrador();

        // Calling methods from the Dog class, Animal interface, and Mammal interface
        labrador.displayInfo(); // From Dog class
        labrador.sound();       // From Animal interface
        labrador.walk();        // From Mammal interface
    }
}

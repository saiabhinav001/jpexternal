// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog dog = new Dog();

        // Call methods from both the parent and child classes
        dog.eat();  // Method inherited from Animal
        dog.bark(); // Method of Dog
    }
}

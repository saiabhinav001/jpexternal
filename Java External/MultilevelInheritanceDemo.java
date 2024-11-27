// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate class (Child of Animal)
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

// Derived class (Child of Mammal)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Call methods from all three levels of inheritance
        dog.eat();  // Inherited from Animal
        dog.walk(); // Inherited from Mammal
        dog.bark(); // Defined in Dog
    }
}

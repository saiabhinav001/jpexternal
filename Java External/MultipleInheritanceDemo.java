// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Vehicle {
    void move();
}

// Class implementing both interfaces
class Dog implements Animal, Vehicle {
    // Implementing the method from Animal interface
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    // Implementing the method from Vehicle interface
    @Override
    public void move() {
        System.out.println("The dog is running.");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of Dog
        Dog dog = new Dog();

        // Calling methods from both interfaces
        dog.eat();  // Method from Animal interface
        dog.move(); // Method from Vehicle interface
    }
}

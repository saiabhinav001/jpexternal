// Unit-1 8th program

class StaticDemo {
    // Static variable
    static int staticVariable;

    // Static block
    static {
        staticVariable = 10;
        System.out.println("Static block executed. Static variable initialized to: " + staticVariable);
    }

    // Static method
    static void display() {
        System.out.println("Static method called. Static variable value: " + staticVariable);
    }

    // Non-static method to demonstrate accessing static members
    void modifyStaticVariable(int value) {
        staticVariable = value;
        System.out.println("Static variable modified to: " + staticVariable);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Access static method and variable directly without creating an object
        StaticDemo.display();

        // Create an object to access the non-static method
        StaticDemo demo = new StaticDemo();
        demo.modifyStaticVariable(25);

        // Call the static method again to see updated value
        StaticDemo.display();
    }
}

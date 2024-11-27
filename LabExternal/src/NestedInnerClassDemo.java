// Outer class
class OuterClass {
    private String outerField = "Outer Class Field";

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }

    // Non-static inner class
    class InnerClass {
        void display() {
            // Accessing outer class field from inner class
            System.out.println("This is a non-static inner class.");
            System.out.println("Accessing: " + outerField);
        }
    }

    // Method to demonstrate creating an instance of the inner class
    void demonstrateInnerClass() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class NestedInnerClassDemo {
    public static void main(String[] args) {
        // Accessing static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Accessing non-static inner class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}

class Demo {
    // Final variable (cannot be changed once initialized)
    final int constantValue = 100;

    // Instance variables
    int value;

    // Constructor using 'this' keyword
    Demo(int value) {
        this.value = value; // 'this' refers to the current instance's variable
    }

    // Method to demonstrate 'this' keyword
    void display() {
        System.out.println("Value using 'this': " + this.value);
    }

    // Final method (cannot be overridden)
    final void showFinalMethod() {
        System.out.println("This is a final method. It cannot be overridden.");
    }
}

class FinalKeywordDemo {
    public static void main(String[] args) {
        Demo obj = new Demo(50);

        // Accessing final variable
        System.out.println("Constant Value (final): " + obj.constantValue);

        // Accessing 'this' keyword usage
        obj.display();

        // Accessing final method
        obj.showFinalMethod();
    }
}

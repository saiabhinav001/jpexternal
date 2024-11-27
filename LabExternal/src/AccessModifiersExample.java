class AccessModifiersDemo {
    public int publicVar = 1;       // Public: Accessible everywhere
    private int privateVar = 2;     // Private: Accessible only within this class
    protected int protectedVar = 3; // Protected: Accessible within the same package and subclasses
    int defaultVar = 4;             // Default: Accessible only within the same package

    // Public method
    public void showPublic() {
        System.out.println("Public Method: Public Variable = " + publicVar);
    }

    // Private method
    private void showPrivate() {
        System.out.println("Private Method: Private Variable = " + privateVar);
    }

    // Protected method
    protected void showProtected() {
        System.out.println("Protected Method: Protected Variable = " + protectedVar);
    }

    // Default method
    void showDefault() {
        System.out.println("Default Method: Default Variable = " + defaultVar);
    }

    // Public method to access private members
    public void accessPrivate() {
        System.out.println("Accessing private method from the same class:");
        showPrivate();
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        AccessModifiersDemo example = new AccessModifiersDemo();

        // Accessing public member
        example.showPublic();

        // Accessing private member via public method
        example.accessPrivate();

        // Accessing protected and default members (within the same package)
        example.showProtected();
        example.showDefault();
    }
}

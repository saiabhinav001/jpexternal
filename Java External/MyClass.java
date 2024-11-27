package myPackage;

public class MyClass {
    // Public member can be accessed from anywhere
    public String publicVariable = "Public Access";

    // Private member can only be accessed within the class
    private String privateVariable = "Private Access";

    // Default member (no modifier) can be accessed within the same package
    String defaultVariable = "Default Access";

    // Protected member can be accessed within the same package or subclasses
    protected String protectedVariable = "Protected Access";

    // Public method
    public void displayPublic() {
        System.out.println(publicVariable);
    }

    // Private method (accessible only inside this class)
    private void displayPrivate() {
        System.out.println(privateVariable);
    }

    // Default method (accessible within the same package)
    void displayDefault() {
        System.out.println(defaultVariable);
    }

    // Protected method (accessible within the same package or subclasses)
    protected void displayProtected() {
        System.out.println(protectedVariable);
    }
}

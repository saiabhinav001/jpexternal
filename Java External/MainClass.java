import myPackage.MyClass;

public class MainClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Accessing public variable and method
        System.out.println(obj.publicVariable);
        obj.displayPublic();

        // Accessing default variable and method (accessible within the same package)
        // System.out.println(obj.defaultVariable);  // Uncomment this line if you move MainClass to the same package
        obj.displayDefault(); // Accessible as it's in the same package

        // Accessing protected variable and method
        // Direct access is allowed because MainClass is not a subclass and is outside the package
        System.out.println(obj.protectedVariable);  // Error if run from a different package without inheritance
        obj.displayProtected(); // Works only if it's in a subclass or same package

        // Accessing private members is not allowed outside the class
        // System.out.println(obj.privateVariable);  // Error
        // obj.displayPrivate();  // Error
    }
}

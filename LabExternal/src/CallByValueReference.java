class CallDemo {
    // Method to demonstrate call by value (modifies a copy of the value)
    void callByValue(int num) {
        num += 10; // Modifying the copy
        System.out.println("Inside callByValue method: num = " + num);
    }

    // Method to demonstrate call by reference (modifies the object)
    void callByReference(int[] arr) {
        arr[0] += 10; // Modifying the object referenced by the array
        System.out.println("Inside callByReference method: arr[0] = " + arr[0]);
    }
}

public class CallByValueReference {
    public static void main(String[] args) {
        CallDemo demo = new CallDemo();

        // Call by value
        int num = 5;
        System.out.println("Before callByValue: num = " + num);
        demo.callByValue(num);
        System.out.println("After callByValue: num = " + num); // Original value remains unchanged

        // Call by reference
        int[] arr = {5}; // Array object to demonstrate call by reference
        System.out.println("\nBefore callByReference: arr[0] = " + arr[0]);
        demo.callByReference(arr);
        System.out.println("After callByReference: arr[0] = " + arr[0]); // Value inside the object changes
    }
}

// Interface for stack operations
interface Stack {
    void push(int value);   // Add an element to the stack
    int pop();              // Remove and return the top element
    int peek();             // View the top element without removing it
    boolean isEmpty();      // Check if the stack is empty
}

// Class implementing the Stack interface
class DynamicStack implements Stack {
    private int[] stackArray;
    private int top;  // Points to the top of the stack

    // Constructor to initialize stack
    public DynamicStack(int initialSize) {
        stackArray = new int[initialSize];
        top = -1; // Empty stack
    }

    // Push method to add elements
    @Override
    public void push(int value) {
        if (top == stackArray.length - 1) {
            // Double the size of the array if it's full
            int[] newArray = new int[stackArray.length * 2];
            System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
            stackArray = newArray;
            System.out.println("Stack resized to: " + stackArray.length);
        }
        stackArray[++top] = value;
    }

    // Pop method to remove elements
    @Override
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow: The stack is empty.");
        }
        return stackArray[top--];
    }

    // Peek method to view the top element
    @Override
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}

// Main class to test the DynamicStack
public class DynamicStackDemo {
    public static void main(String[] args) {
        // Create a stack with an initial size of 3
        Stack stack = new DynamicStack(3);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Stack resizes when adding another element
        stack.push(40);

        // View the top element
        System.out.println("Top of stack: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

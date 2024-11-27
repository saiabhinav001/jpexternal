public class StringBufferDemo {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello, Java!");

        // a) length()
        System.out.println("Length of StringBuffer: " + sb.length());

        // b) capacity()
        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        // c) ensureCapacity()
        sb.ensureCapacity(50); // Ensures a minimum capacity of 50
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // d) charAt()
        System.out.println("Character at index 7: " + sb.charAt(7));

        // e) setLength()
        sb.setLength(5); // Sets the length to 5, truncating the rest
        System.out.println("StringBuffer after setLength(5): " + sb);

        // f) reverse()
        sb = new StringBuffer("Hello, Java!"); // Resetting StringBuffer
        sb.reverse();
        System.out.println("Reversed StringBuffer: " + sb);
    }
}

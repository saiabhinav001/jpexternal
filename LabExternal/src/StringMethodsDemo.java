public class StringMethodsDemo {
    public static void main(String[] args) {
        // Creating a string
        String str1 = "Hello, World!";
        String str2 = "Hello, Java!";

        // a) length()
        System.out.println("Length of str1: " + str1.length());

        // b) charAt()
        System.out.println("Character at index 7 in str1: " + str1.charAt(7));

        // c) equals()
        System.out.println("Are str1 and str2 equal? " + str1.equals(str2));

        // d) compareTo()
        System.out.println("Comparison of str1 and str2: " + str1.compareTo(str2));

        // e) indexOf()
        System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));

        // f) substring()
        System.out.println("Substring of str1 from index 7: " + str1.substring(7));

        // g) concat()
        String str3 = str1.concat(" Let's learn Java.");
        System.out.println("Concatenated string: " + str3);

        // h) replace()
        String str4 = str1.replace("World", "Java");
        System.out.println("String after replacement: " + str4);

        // i) toString()
        System.out.println("Using toString() method: " + str1.toString());
    }
}

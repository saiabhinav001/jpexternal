// Custom class that inherits from Object class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() method of Object class
    @Override
    public String toString() {
        return "Person [Name: " + name + ", Age: " + age + "]";
    }

    // Overriding equals() method of Object class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // If the same object
        if (obj == null || getClass() != obj.getClass()) return false;  // If different classes or null
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    // Overriding hashCode() method of Object class
    @Override
    public int hashCode() {
        return name.hashCode() + age; // Simple hashcode calculation
    }

    // Overriding clone() method of Object class (throws CloneNotSupportedException)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Person(this.name, this.age);
    }
}

public class ObjectClassMethodsDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creating Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Alice", 25);

        // Demonstrating toString() method
        System.out.println("person1: " + person1.toString());

        // Demonstrating equals() method
        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " + person1.equals(person3));

        // Demonstrating hashCode() method
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());

        // Demonstrating clone() method
        Person clonedPerson = (Person) person1.clone();
        System.out.println("Cloned person: " + clonedPerson.toString());
    }
}

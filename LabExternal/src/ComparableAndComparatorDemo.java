import java.util.*;

// Student class implementing Comparable
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;

    // Constructor
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Natural ordering: by roll number
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "', marks=" + marks + "}";
    }
}

// Comparator for sorting by marks
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.marks, s1.marks); // Descending order
    }
}

public class ComparableAndComparatorDemo {
    public static void main(String[] args) {
        // List of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 85));
        students.add(new Student(1, "Bob", 92));
        students.add(new Student(2, "Charlie", 78));

        // Sort by natural order (roll number)
        Collections.sort(students);
        System.out.println("Students sorted by roll number (natural order):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by custom order (marks) using Comparator
        students.sort(new MarksComparator());
        System.out.println("\nStudents sorted by marks (custom order):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

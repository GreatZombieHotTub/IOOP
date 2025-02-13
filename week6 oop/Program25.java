// Student class

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String extractInitials() {
        String[] parts = name.split(" ");
        String initials = "";
        for (String part : parts) {
            if (!part.isEmpty()) {
                initials += part.charAt(0);
            }
        }
        return initials.toUpperCase();
    }

    public String removeWhitespace() {
        return name.replaceAll("\\s+", "");
    }

    public boolean containsSubstring(String substring) {
        return name.contains(substring);
    }

    // Manual sorting method (Bubble Sort)
    public static void sortStudents(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    // Swap students[j] and students[j + 1]
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}


import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array to store student objects
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            String name = scanner.nextLine();
            students[i] = new Student(name);
        }

        // Display student details
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
        }

        // Demonstrate extractInitials() and removeWhitespace()
        System.out.println("\nStudent Initials and Names Without Whitespace:");
        for (Student student : students) {
            System.out.println("Original: " + student.getName());
            System.out.println("Initials: " + student.extractInitials());
            System.out.println("Without Whitespace: " + student.removeWhitespace());
        }

        // Find students with a particular substring in their name
        System.out.print("\nEnter a substring to search for in student names: ");
        String substring = scanner.nextLine();
        System.out.println("Students containing '" + substring + "':");
        for (Student student : students) {
            if (student.containsSubstring(substring)) {
                System.out.println(student.getName());
            }
        }

        // Sort students alphabetically
        Student.sortStudents(students);
        System.out.println("\nStudents sorted alphabetically:");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        scanner.close();
    }
}

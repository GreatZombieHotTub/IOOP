package week10;

class Student {
    private String name;
    private int age;

    // Method to register a student
    public void registerStudent(String name, int age) {
        if (age < 18 || age > 60) {
            throw new IllegalArgumentException("Error: Age must be between 18 and 60 for registration.");
        }
        this.name = name;
        this.age = age;
        System.out.println("Student registered successfully!");
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class StudentAgeValidationDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // Test with a valid age
        try {
            student.registerStudent("Alice", 22);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Test with an invalid age (too young)
        try {
            student.registerStudent("Bob", 16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Test with an invalid age (too old)
        try {
            student.registerStudent("Charlie", 65);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
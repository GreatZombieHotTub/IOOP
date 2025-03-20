package edu.manipal.mit;

public class DefaultAccessDemo {
    public static void main(String[] args) {
        Student student = new Student();  // Works fine
        student.name = "John Doe";        // Works fine
        student.rollNumber = 101;         // Works fine
        student.displayDetails();         // Works fine
    }
}

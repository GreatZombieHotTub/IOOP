package edu.manipal.mit.main;

import edu.manipal.mit.student.Student;
import edu.manipal.mit.course.Course;
import edu.manipal.mit.registration.Registration;

public class Main {
    public static void main(String[] args) {
        // Create student object
        Student student = new Student("John Doe", 12345, "CSE", 3.8);

        // Create course object
        Course course = new Course("Machine Learning", "Dr. Smith", 4);

        // Register student to the course
        Registration registration = new Registration(student, course);
        registration.registerStudent();
    }
}

package edu.manipal.mit.registration;

import edu.manipal.mit.student.Student;
import edu.manipal.mit.course.Course;

public class Registration {
    private Student student;
    private Course course;

    // Constructor
    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Register student to the course
    public void registerStudent() {
        System.out.println("Registration Successful!");
        System.out.println("Student: " + student.getName() + " (Roll Number: " + student.getRollNumber() + ")");
        System.out.println("Department: " + student.getDepartment());
        System.out.println("GPA: " + student.getGpa());
        System.out.println("Registered Course: " + course.getCourseName());
        System.out.println("Instructor: " + course.getInstructor());
        System.out.println("Credits: " + course.getCredits());
    }
}

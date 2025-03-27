package week10;

//Custom checked exception for full courses
class CourseFullException extends Exception {
 public CourseFullException(String message) {
     super(message);
 }
}

//Course class that manages enrollment
class Course {
 private String courseName;
 private int capacity;
 private int enrolledStudents;

 // Constructor
 public Course(String courseName, int capacity) {
     this.courseName = courseName;
     this.capacity = capacity;
     this.enrolledStudents = 0; // Initially, no students are enrolled
 }

 // Method to enroll a student
 public void enrollStudent(String studentName) throws CourseFullException {
     if (enrolledStudents >= capacity) {
         throw new CourseFullException("Enrollment failed! The course '" + courseName + "' is already full.");
     }
     enrolledStudents++; // Increase enrolled students count
     System.out.println(studentName + " enrolled ");
 }
}

//Demo class to handle enrollment
public class CourseCapacityDemo {
 public static void main(String[] args) {
     // Create a course with a capacity of 3 students
     Course course = new Course("Data Structures", 2);

     // Enroll students
     try {
         course.enrollStudent("Alice");
         course.enrollStudent("Bob");
         course.enrollStudent("Charlie");
         
         // This should cause an exception (4th student)
         course.enrollStudent("David");
     } catch (CourseFullException e) {
         System.out.println("Exception Caught: " + e.getMessage());
     }
 }
}


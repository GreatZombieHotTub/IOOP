package week10;

//Student class
class Student1 {
 // Method to calculate the average marks
 public void calculateAverage(int totalMarks, int numberOfSubjects) {
     if (numberOfSubjects == 0) {
         throw new ArithmeticException("Error: Number of subjects cannot be zero (division by zero).");
     }
     if (totalMarks == 0) {
         throw new ArithmeticException("Error: Total marks cannot be zero.");
     }
     double average = (double) totalMarks / numberOfSubjects;
     System.out.println("Average Marks: " + average);
 }
}

//Demo class to test the exception handling
public class MarksValidationDemo {
 public static void main(String[] args) {
     Student1 student = new Student1();

     // Test with valid data
     try {
         student.calculateAverage(450, 5); // Valid case
     } catch (ArithmeticException e) {
         System.out.println(e.getMessage());
     }

     // Test with zero number of subjects
     try {
         student.calculateAverage(400, 0); // This will cause an exception
     } catch (ArithmeticException e) {
         System.out.println(e.getMessage());
     }

     // Test with zero total marks
     try {
         student.calculateAverage(0, 5); // This will also cause an exception
     } catch (ArithmeticException e) {
         System.out.println(e.getMessage());
     }
 }
}

package edu.manipal.mit;

public class PrivateAccessDemo {
    public static void main(String[] args) {
        Student student = new Student();
        
        // Using setter methods to assign values (Works)
        student.setName("Alice");
        student.setRollNumber(202);
        
        // Displaying student details
        student.displayDetails();
        
        // Trying to access private attributes directly (Compilation Error)
        // student.name = "Bob";       // Error: name has private access
        // student.rollNumber = 303;   // Error: rollNumber has private access
    }
}


//javac -d . edu/manipal/mit/Student.java
//javac -d . edu/manipal/mit/PrivateAccessDemo.java
//java edu.manipal.mit.PrivateAccessDemo
/*PrivateAccessDemo.java:13: error: name has private access in Student
        student.name = "Bob";
                     ^
PrivateAccessDemo.java:14: error: rollNumber has private access in Student
        student.rollNumber = 303;
                            ^
2 errors
*/

/*after fixing errors
Student Name: Alice
Roll Number: 202
*/
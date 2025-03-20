package edu.manipal.kmc;

import edu.manipal.mit.Student;  

public class AccessTest {
    public static void main(String[] args) {
        Student student = new Student();  
        student.name = "Alice";           
        student.rollNumber = 202;        
        student.displayDetails();         
    }
}

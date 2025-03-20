package edu.manipal.mit;

class Student {  
    String name;       
    int rollNumber;    

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

//updated for Q2
/*package edu.manipal.mit;

public class Student {
    private String name;      // Now private
    private int rollNumber;   // Now private

    // Public method to set name
    public void setName(String name) {
        this.name = name;
    }

    // Public method to set roll number
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Public method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}*/

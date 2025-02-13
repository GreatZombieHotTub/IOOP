// Enhance the student class

public class Student {
    private String name;
    private Subject[] subjects;
    private int subjectCount;

    public Student(String name, int maxSubjects) {
        this.name = name;
        this.subjects = new Subject[maxSubjects];
    }

    // Inner class Subject
    private class Subject {
        String subjectName;
        int marks;

        Subject(String subjectName) {
            this.subjectName = subjectName;
        }

        void setMarks(int marks) {
            this.marks = marks;
        }

        void display() {
            System.out.println(subjectName + ": " + marks + " marks");
        }
    }

    void addSubject(String subjectName) {
        if (subjectCount < subjects.length) 
            subjects[subjectCount++] = new Subject(subjectName);
    }

    void assignMarks(int index, int marks) {
        if (index < subjectCount) subjects[index].setMarks(marks);
    }

    void displaySubjects() {
        System.out.println("Subjects for " + name + ":");
        for (int i = 0; i < subjectCount; i++) subjects[i].display();
    }

    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < subjectCount; i++) total += subjects[i].marks;
        return total;
    }

    double calculateAverage() {
        return subjectCount == 0 ? 0 : (double) calculateTotal() / subjectCount;
    }
}


import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        Student student = new Student(sc.nextLine(), 5);

        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject name: ");
            student.addSubject(sc.nextLine());
        }

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            student.assignMarks(i, sc.nextInt());
        }

        System.out.println("\nStudent Report:");
        student.displaySubjects();
        System.out.println("Total Marks: " + student.calculateTotal());
        System.out.println("Average Marks: " + student.calculateAverage());

        sc.close();
    }
}

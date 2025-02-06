import java.util.Scanner;

// Student class
class Student {
    private String name;
    private double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

// GradeCalculator class
class GradeCalculator {
    // Method to calculate grade based on marks
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

// mainapp2 class 
public class mainapp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        // Creating a Student object
        Student student = new Student(name, marks);

        // Creating a GradeCalculator object
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Calculating grade
        String grade = gradeCalculator.calculateGrade(marks);

        // Display student details and grade
        student.displayDetails();
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

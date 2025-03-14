import java.util.Scanner;

// Class to store student details
class StudentRecord {
    // Fields to store student details
    private String studentID;
    private String name;
    private String course;

    // Constructor to initialize fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Class to interact with the user
public class StudentApp {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for student details
        System.out.print("Enter your Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Course: ");
        String course = scanner.nextLine();

        // Instantiate a StudentRecord object with user-provided data
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display the student details
        student.displayInfo();

        // Close the scanner
        scanner.close();
    }
}
import java.util.Scanner;

// Employee class
class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee name
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// SalaryCalculator class
class SalaryCalculator {
    // Method to calculate 10% bonus
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

// MainApp class 
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Creating an Employee object
        Employee employee = new Employee(name, salary);

        // Creating a SalaryCalculator object
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        double bonus = salaryCalculator.calculateBonus(salary);

        // Display employee details and bonus
        employee.displayDetails();
        System.out.println("Bonus: $" + bonus);

        scanner.close();
    }
}

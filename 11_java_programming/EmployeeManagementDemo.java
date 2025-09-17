// Employee Management System - Hierarchical Inheritance Example
// Best practices: encapsulation, abstract class, interface, polymorphism

/**
 * Abstract class representing a generic Employee.
 */
abstract class Employee {
    private final String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

/**
 * Interface for department assignment and details.
 */
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

/**
 * Full-time employee implementation.
 */
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double bonus;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "FullTime: " + department;
    }
}

/**
 * Part-time employee implementation.
 */
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "PartTime: " + department;
    }
}

/**
 * Demo for polymorphic employee processing.
 */
public class EmployeeManagementDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
            new FullTimeEmployee("E001", "Alice", 50000, 10000),
            new PartTimeEmployee("E002", "Bob", 0, 80, 500)
        };
        ((Department)employees[0]).assignDepartment("HR");
        ((Department)employees[1]).assignDepartment("Support");
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("Department: " + ((Department)emp).getDepartmentDetails());
            System.out.println();
        }
    }
}

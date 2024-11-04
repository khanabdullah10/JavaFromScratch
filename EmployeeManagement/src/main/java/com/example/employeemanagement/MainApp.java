package com.example.employeemanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        employeeRepository = context.getBean(EmployeeRepository.class);

        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> getEmployeeMenu();
                case 3 -> updateEmployeeSalary();
                case 4 -> deleteEmployee();
                case 5 -> System.exit(0);
                default -> System.out.println(" ! Invalid option. Please try again. ! ");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("Menu:");
        System.out.println("1) Add Employee");
        System.out.println("2) Get Employee");
        System.out.println("3) Update Employee Salary");
        System.out.println("4) Delete Employee");
        System.out.println("5) Exit");
        System.out.print("Choose an option: ");
    }

    private static void addEmployee() {
        Employee employee = new Employee();
        System.out.print("Enter Employee Name: ");
        employee.setEmpName(scanner.nextLine());
        System.out.print("Enter Address: ");
        employee.setAddress(scanner.nextLine());
        System.out.print("Enter City: ");
        employee.setCity(scanner.nextLine());
        System.out.print("Enter Salary: ");
        employee.setSalary(scanner.nextDouble());
        scanner.nextLine(); // Consume newline

        employeeRepository.addEmployee(employee);
        System.out.println("[Employee added successfully.]");
    }

    private static void getEmployeeMenu() {
        System.out.println("1) Get All Employees");
        System.out.println("2) Get Employee By ID");
        System.out.println("3) Get Employees By City and Salary");
        System.out.println("4) Print All Employee Details"); // New option
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1 -> displayAllEmployees();
            case 2 -> getEmployeeById();
            case 3 -> getEmployeesByCityAndSalary();
            case 4 -> employeeRepository.printAllEmployeeDetails(); // Call to the new method
            default -> System.out.println(" ! Invalid option. Please try again. ! ");
        }
    }

    private static void displayAllEmployees() {
        List<Employee> employees = employeeRepository.getAllEmployees();
        if (employees.isEmpty()) {
            System.out.println("[ Oops No employees found. ]");
        } else {
            employees.forEach(emp -> System.out.println(emp.getEmpId() + " " + emp.getEmpName()));
        }
    }

    private static void getEmployeeById() {
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Employee employee = employeeRepository.getEmployeeById(empId);
        if (employee != null) {
            System.out.println("Employee Found: " + employee.getEmpName());
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void getEmployeesByCityAndSalary() {
        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        List<Employee> filteredEmployees = employeeRepository.getEmployeesByCityAndSalary(city, salary);
        if (filteredEmployees.isEmpty()) {
            System.out.println("[No employees found in " + city + " with a salary greater than " + salary + ".]");
        } else {
            filteredEmployees.forEach(emp -> System.out.println(emp.getEmpId() + " " + emp.getEmpName()));
        }
    }

    private static void updateEmployeeSalary() {
        try {
            System.out.print("Enter Employee ID to update salary: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter percentage increase (e.g., enter 10 for 10%): ");
            double percentage = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            employeeRepository.updateEmployeeSalary(empId, percentage);
            System.out.println("[Employee salary updated successfully.]");
        } catch (Exception e) {
            System.out.println("Error updating employee salary: " + e.getMessage());
        }
    }

    private static void deleteEmployee() {
        try {
            System.out.print("Enter Employee ID to delete: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            employeeRepository.deleteEmployeeById(empId);
            System.out.println("[Employee deleted successfully.]");
        } catch (Exception e) {
            System.out.println("Error deleting employee: " + e.getMessage());
        }
    }
}

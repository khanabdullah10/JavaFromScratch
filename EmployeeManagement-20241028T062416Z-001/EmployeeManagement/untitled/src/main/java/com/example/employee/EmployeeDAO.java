package com.example.employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDAO {
    private Connection connection;

    public EmployeeDAO() throws SQLException {
        connection = DBConnection.getConnection();
    }

    public void addEmployee(Employee emp) throws SQLException {
        String query = "INSERT INTO Employee (empName, address, city, salary) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, emp.getEmpName());
            stmt.setString(2, emp.getAddress());
            stmt.setString(3, emp.getCity());
            stmt.setDouble(4, emp.getSalary());
            stmt.executeUpdate();
        }
    }

    public List<Employee> getAllEmployees() throws SQLException {
        String query = "SELECT * FROM Employee";
        List<Employee> employees = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                employees.add(new Employee(
                        rs.getInt("empId"), rs.getString("empName"),
                        rs.getString("address"), rs.getString("city"),
                        rs.getDouble("salary")));
            }
        }
        return employees;
    }

    public Optional<Employee> getEmployeeById(int empId) throws SQLException {
        String query = "SELECT * FROM Employee WHERE empId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, empId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Employee employee = new Employee(
                            rs.getInt("empId"),
                            rs.getString("empName"),
                            rs.getString("address"),
                            rs.getString("city"),
                            rs.getDouble("salary"));
                    return Optional.of(employee);
                } else {
                    System.out.println("Employee with ID " + empId + " does not exist.");
                    return Optional.empty();
                }
            }
        }
    }

    public List<Employee> getEmployeesByCityAndSalary(String city, double salary) throws SQLException {
        String query = "SELECT * FROM Employee WHERE city = ? AND salary > ?";
        List<Employee> employees = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, city);
            stmt.setDouble(2, salary);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    employees.add(new Employee(
                            rs.getInt("empId"), rs.getString("empName"),
                            rs.getString("address"), rs.getString("city"),
                            rs.getDouble("salary")));
                }
            }
        }
        return employees;
    }

    public void updateEmployeeSalary(int empId, double percentage) throws SQLException {
        String query = "UPDATE Employee SET salary = salary + (salary * ? / 100) WHERE empId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setDouble(1, percentage);
            stmt.setInt(2, empId);
            stmt.executeUpdate();
        }
    }

    public void deleteEmployeeById(int empId) throws SQLException {
        String query = "DELETE FROM Employee WHERE empId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, empId);
            stmt.executeUpdate();
        }
    }
}

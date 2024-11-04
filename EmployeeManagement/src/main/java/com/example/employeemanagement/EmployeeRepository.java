package com.example.employeemanagement;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeRepository {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO Employee (empName, address, city, salary) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, employee.getEmpName(), employee.getAddress(), employee.getCity(), employee.getSalary());
    }

    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM Employee";
        return jdbcTemplate.query(sql, new EmployeeRowMapper());
    }

    public Employee getEmployeeById(int empId) {
        String sql = "SELECT * FROM Employee WHERE empId = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{empId}, new EmployeeRowMapper());
    }

    public List<Employee> getEmployeesByCityAndSalary(String city, double salary) {
        String sql = "SELECT * FROM Employee WHERE city = ? AND salary > ?";
        return jdbcTemplate.query(sql, new Object[]{city, salary}, new EmployeeRowMapper());
    }

    public void updateEmployeeSalary(int empId, double percentage) {
        String sql = "UPDATE Employee SET salary = salary + (salary * ? / 100) WHERE empId = ?";
        jdbcTemplate.update(sql, percentage, empId);
    }

    public void deleteEmployeeById(int empId) {
        String sql = "DELETE FROM Employee WHERE empId = ?";
        jdbcTemplate.update(sql, empId);
    }



    public void printAllEmployeeDetails() {
        List<Employee> employees = getAllEmployees();
        System.out.println("Employee ID\t Name\t\t Address \t\t City \t\t Salary");
        System.out.println("-------------------------------------------------------");
        for (Employee emp : employees) {
            System.out.printf("%d \t\t %s\t\t%s\t\t%s\t\t%.2f%n",
                    emp.getEmpId(),
                    emp.getEmpName(),
                    emp.getAddress(),
                    emp.getCity(),
                    emp.getSalary());
        }
    }



    private static class EmployeeRowMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setEmpId(rs.getInt("empId"));
            employee.setEmpName(rs.getString("empName"));
            employee.setAddress(rs.getString("address"));
            employee.setCity(rs.getString("city"));
            employee.setSalary(rs.getDouble("salary"));
            return employee;
        }
    }
}

package com.example.employeemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public Employee getEmployeeById(int empId) {
        return employeeRepository.getEmployeeById(empId);
    }

    public List<Employee> getEmployeesByCityAndSalary(String city, double salary) {
        return employeeRepository.getEmployeesByCityAndSalary(city, salary);
    }

        public void updateEmployeeSalary(int empId, double percentage) {
            employeeRepository.updateEmployeeSalary(empId, percentage);
        }

        public void deleteEmployeeById(int empId) {
            employeeRepository.deleteEmployeeById(empId);
        }
}

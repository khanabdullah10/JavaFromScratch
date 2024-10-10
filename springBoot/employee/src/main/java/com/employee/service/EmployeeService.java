package com.employee.service;

import com.employee.exception.EmployeeNotFoundException;
import com.employee.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    private final Map<Long, Employee> employeeMap = new HashMap<>();

    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employeeMap.values());
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    public Employee getEmployeeById(Long id){
        Employee employee = employeeMap.get(id);
        if (employee== null){
            throw new EmployeeNotFoundException("Employee with id "+ id +" not found");
        }
        return employee;
    }

    public Employee addEmployee(Employee emp){
        employeeMap.put(emp.getId(),emp);
        return emp;
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    public Employee updateEmployee(Long id,String name){
        Employee emp = employeeMap.get(id);
        if(emp==null){
            throw new EmployeeNotFoundException("Employee with id " + id +" not found");
        }
        emp.setName(name);
        return emp;
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    public void deleteEmployee(Long id ){
        if(!employeeMap.containsKey(id)){
            throw new EmployeeNotFoundException("Employee with id " + id +" not found");
        }
        employeeMap.remove(id);
    }



}

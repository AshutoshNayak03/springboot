package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.Employee;
public interface EmployeeService {
    Employee addEmployee(String name, String role);
    List<Employee> getAllEmployees();
}
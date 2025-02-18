package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private static final Map<String, String> ROLE_MAPPING = new HashMap<>();

    static {
        ROLE_MAPPING.put("developer", "Developer");
        ROLE_MAPPING.put("tester", "Tester");
        ROLE_MAPPING.put("architect", "Architect");
    }

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(String name, String role) {
        String assignedRole = ROLE_MAPPING.getOrDefault(role.toLowerCase(), "Unknown");
        Employee employee = new Employee(name, assignedRole);
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
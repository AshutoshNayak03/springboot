package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees") // Base URL for the API
public class EmployeeController {

    private final List<EmployeeList> employees = List.of(
            new EmployeeList(1, "Alice", "IT", 50000),
            new EmployeeList(2, "Bob", "HR", 45000),
            new EmployeeList(3, "Charlie", "Finance", 60000)
    );

    @GetMapping
    public List<EmployeeList> getAllEmployees() {
        return employees;
    }
}

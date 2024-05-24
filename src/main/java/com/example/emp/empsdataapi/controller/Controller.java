package com.example.emp.empsdataapi.controller;

import com.example.emp.empsdataapi.entity.Employee;
import com.example.emp.empsdataapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/createEmployee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        System.out.println("insdie saveEmployee method");
        return employeeService.createEmployee(employee);
    }
}

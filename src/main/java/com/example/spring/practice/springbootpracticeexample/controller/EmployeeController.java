package com.example.spring.practice.springbootpracticeexample.controller;

import com.example.spring.practice.springbootpracticeexample.entity.Employee;
import com.example.spring.practice.springbootpracticeexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/code")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/save")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee e) {
       Employee savedEmpl= employeeService.addEmployee(e);
        return new ResponseEntity<>(savedEmpl, HttpStatus.CREATED);

    }
   /* @GetMapping
    public List<Employee> getAllEmployees() {
        System.out.println("getting all employees from H2 Db");
        Employee e= new Employee();
        List<Employee> list = new ArrayList<>();
        list.add(e);
        return list;
    }*/
}

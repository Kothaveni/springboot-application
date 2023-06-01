package com.example.spring.practice.springbootpracticeexample.service;

import com.example.spring.practice.springbootpracticeexample.entity.Employee;
import com.example.spring.practice.springbootpracticeexample.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee addEmployee(Employee e) {
    Employee emp = employeeRepo.save(e);
    return emp;
    }
}

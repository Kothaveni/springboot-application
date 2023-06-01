package com.example.spring.practice.springbootpracticeexample.repos;

import com.example.spring.practice.springbootpracticeexample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo  extends JpaRepository<Employee,Long> {

}
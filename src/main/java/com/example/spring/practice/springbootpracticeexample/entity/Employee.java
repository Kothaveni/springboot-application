package com.example.spring.practice.springbootpracticeexample.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="employee")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int salary;
    private String  address;

}

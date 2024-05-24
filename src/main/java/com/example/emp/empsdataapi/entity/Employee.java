package com.example.emp.empsdataapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int emp_id;
   private String emp_name;
   private String emp_surname;
   private int emp_age;

}


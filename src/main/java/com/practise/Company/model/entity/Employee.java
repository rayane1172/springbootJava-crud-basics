package com.practise.Company.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "employee")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

   @Column(name = "emp_id")
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(name = "fname")
   private String firstName;
   @Column(name = "sname")
   private String secondName;
   private Double salary;



}

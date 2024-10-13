package com.practise.Company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Company.model.entity.Employee;
import com.practise.Company.repository.EmpRepo;




@Service
public class EmpService {

   @Autowired
   private EmpRepo empRP;

   public Employee getUser(Integer id) {
      Optional<Employee> emp = this.empRP.findById(id);
      return emp.orElse(new Employee()); //return empty employee object
      //TODO if we write : return emp.orElse(null) -> response is null 
   }

   public List<Employee> getAllUsers() {
      return empRP.findAll();
   }

   public Employee saveEmployee(Employee E) {
      return this.empRP.save(E); // save Object then return it back as a response
   }

   public void saveEmployeeWithoutresponse(Employee E) {
      this.empRP.save(E);
   }

   public void deleteEmployee(Integer id) {
      this.empRP.deleteById(id);
   }

   public Employee updateEmployee(Employee E) {
      return this.empRP.save(E);
   }

}

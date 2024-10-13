package com.practise.Company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.Company.model.entity.Employee;
import com.practise.Company.service.EmpService;

@RequestMapping("/employees")
@RestController
public class EmployeeController {

   @Autowired
   private EmpService empSR;

   //get from db
   @GetMapping("/get-emp")
   public Employee getUser(@RequestParam Integer id) {
      return empSR.getUser(id);
      //TODO  return ResponseEntity.ok(empSR.getUser(id)); -> when i use ResponseEntity as type of http response
   }

   @GetMapping("/get-all-emp")
   public ResponseEntity getAllUsers() {
      return ResponseEntity.ok(empSR.getAllUsers());
   }

   //save to db
   @PostMapping("/save-emp")
   public Employee saveEmployee(@RequestBody Employee employee) {
      return empSR.saveEmployee(employee);
   }
   @PostMapping("/save-emp-without-response")
   public void saveEmployeeWithoutResponse(@RequestBody Employee employee) {
      empSR.saveEmployeeWithoutresponse(employee);
   }


   //delete from db with id
   @GetMapping("delete-user")
   public void deleteUser(@RequestParam Integer id) {
      empSR.deleteEmployee(id);
   }


   //update in db
   @PostMapping("/update-emp")
   public Employee updateEmp(@RequestBody Employee E) {
      
      return this.empSR.updateEmployee(E);

   }

~

}
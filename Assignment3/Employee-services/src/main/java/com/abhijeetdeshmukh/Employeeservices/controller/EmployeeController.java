package com.abhijeetdeshmukh.Employeeservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhijeetdeshmukh.Employeeservices.entity.Employee;
import com.abhijeetdeshmukh.Employeeservices.services.EmployeeServices;


@RestController
//@RequestMapping("/employeee")
public class EmployeeController {
	@Autowired
	private EmployeeServices EmployeeService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/employeee") 
	public Employee saveDepartment(@RequestBody Employee employee) { 
	System.out.println("Hii"); 
	return EmployeeService.save(employee); 
	}
	  
	
	 /* @GetMapping("/{id}") public Employee findDepartmentById(@PathVariable("id")
	 * Long id) { return EmployeeService.findEmployeeById(id); }
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/")
	public List<Employee> findEmployee() {
		System.out.println("AAAAAAAA");
		return EmployeeService.findEmployee();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		EmployeeService.deleteEmployee(id);
	}
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		employee.setId(id);
		return EmployeeService.updateEmployee(employee);
	}
}

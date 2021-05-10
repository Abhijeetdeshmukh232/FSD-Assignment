package com.abhijeetdeshmukh.Employeeservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhijeetdeshmukh.Employeeservices.entity.Employee;
import com.abhijeetdeshmukh.Employeeservices.repository.EmployeeRepository;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	/*
	 * public Employee findEmployeeById(Long id) { return
	 * employeeRepository.findEmployeeById(id); }
	 */


	public java.util.List<Employee> findEmployee() {
		return employeeRepository.findAll();
	}

	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println(employee);
		//employeeRepository.deleteById(employee);
		return employeeRepository.saveAndFlush(employee);
	}
}

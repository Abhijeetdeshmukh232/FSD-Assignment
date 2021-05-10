package com.abhijeetdeshmukh.Employeeservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhijeetdeshmukh.Employeeservices.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

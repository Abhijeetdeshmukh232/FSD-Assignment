package com.abhijeetdeshmukh.Employeeservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String EmployeeName;
	private String EmployeeAddress;
	private String EmployeePID;
	
	public Employee() {
		
	}

	public Employee(Long id, String employeeName, String employeeAddress, String employeePID) {
		super();
		this.id = id;
		EmployeeName = employeeName;
		EmployeeAddress = employeeAddress;
		EmployeePID = employeePID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	public String getEmployeePID() {
		return EmployeePID;
	}

	public void setEmployeePID(String employeePID) {
		EmployeePID = employeePID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", EmployeeName=" + EmployeeName + ", EmployeeAddress=" + EmployeeAddress
				+ ", EmployeePID=" + EmployeePID + "]";
	}
	
	

}

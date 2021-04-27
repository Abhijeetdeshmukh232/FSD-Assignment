package com.Abhijeet.Spring_Hibernate.Hibernate.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;


import com.Abhijeet.Spring_Hibernate.Hibernate.entities.Employee;

import org.springframework.orm.hibernate5.HibernateTemplate;


import com.Abhijeet.Spring_Hibernate.Hibernate.entities.Employee;

public class EmployeeDao {

	
	private HibernateTemplate hibernateTemplate;
	
	// insert employee
	@Transactional
	public int addEmployee(Employee employee) {
		Integer rows = (Integer)hibernateTemplate.save(employee);
		return rows;
	}
	@Transactional
	public List<Employee> getAllEmployee(){
		List<Employee> employees = hibernateTemplate.loadAll(Employee.class);
		return employees;
	}
	@Transactional
	public Employee getEmployeeById(int id){
		Employee employee = hibernateTemplate.get(Employee.class,id);
		return employee;
	}
	@Transactional
	public void updateEmployee(Employee updateEmployee){
		hibernateTemplate.update(updateEmployee);
	}
	@Transactional
	public void deleteEmployee(int id) {
		Employee employee = hibernateTemplate.get(Employee.class,id);
		hibernateTemplate.delete(employee);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
}

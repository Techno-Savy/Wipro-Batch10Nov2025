package com.example.service;

import java.util.List;

import com.example.bean.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(Integer id);
	public Employee createEmployee(Employee employee); // this is for posting the data
	public Employee updateEmployee(Integer id , Employee employee);
	void deleteEmployee(Integer id); 
	

}

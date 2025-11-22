package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Employee;
import com.example.repo.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	// who will be saving the data for us and who will provide methods for all crud operations i.e. JpaRepository
	
	@Autowired
	EmployeeRepository empRepository;
	
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return empRepository.save(employee);
	}
	
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		
		return empRepository.findById(id).orElse(null);
	}



	@Override
	public Employee updateEmployee(Integer id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

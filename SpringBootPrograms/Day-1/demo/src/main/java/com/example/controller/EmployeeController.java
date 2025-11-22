package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Employee;
import com.example.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	// when we call http://localhost:8080/api/post/create then pass the data through requestbody in the form of jso
	/* {
	 * name:"Niti Dwivedi"
	
     }*/
	
	// Controller will send the request to service ----> service will send to repository ---> will save the data in database using hibernate
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) 
	{
		Employee emp1 =empService.createEmployee(employee);
		return new ResponseEntity<>(emp1,HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getEmployee()
	{
			List<Employee> emp = empService.getAllEmployee();
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	
	//endpoints -- apis
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id)
	{
		
		Employee emp = empService.getEmployeeById(id);
		if(emp==null)
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
			// return new ResponseEntity<>("An internal server error occurred", HttpStatus.INTERNAL_SERVER_ERROR); // 500 Internal Server Error
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	@PutMapping("/put")
	public  ResponseEntity<String> updateEmployee()
	{
		
		return new ResponseEntity<>("The employee details retrieved",HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public  ResponseEntity<String> deleteEmployee()
	{
		return new ResponseEntity<>("The employee details retrieved",HttpStatus.OK);
		
	}
}

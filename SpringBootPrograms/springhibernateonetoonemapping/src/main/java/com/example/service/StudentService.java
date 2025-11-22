package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dao.StudentDaoImpl;
import com.example.entity.Student;

@Service
public class StudentService {
	
	private final StudentDaoImpl dao;

	public StudentService(StudentDaoImpl dao) {
		super();
		this.dao = dao;
	}
	
	
	public void saveData(Student student)
	{
		dao.saveStudent(student);
	}
	
	public Student getStudent(Long id)
	{
		
		return dao.getStudent(id);
	}
	

}

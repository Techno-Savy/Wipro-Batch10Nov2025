package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IStudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private final IStudentDao dao;

	public StudentService(IStudentDao dao) {
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

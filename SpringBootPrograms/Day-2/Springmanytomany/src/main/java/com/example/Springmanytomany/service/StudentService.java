package com.example.Springmanytomany.service;

import org.springframework.stereotype.Service;

import com.example.Springmanytomany.dao.IStudentDao;
import com.example.Springmanytomany.dao.StudentDaoImpl;
import com.example.Springmanytomany.entity.Student;

@Service
public class StudentService{
	
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
package com.example.springhiborm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springhiborm.dao.StudentDao;
import com.example.springhiborm.entity.Student;

import jakarta.transaction.Transactional;

//@controller  --> @Service ---- > @Repository(create a methods for crud operations) ----> Hibernate(ORM framework ) ---> database 

@Service
@Transactional  // It's a annotation driven based so we need not to explicitly call commit
public class StudentService {
	
	@Autowired
	private final StudentDao dao;
	
	public StudentService(StudentDao dao)
	{
		this.dao = dao;
	}
	
	public void create(Student s )
	{
		dao.save(s);
		
	}
	
	
	public Student get(Long id)
	{
		
		return dao.findById(id);
	}
	
	public List<Student> list()
	{
		
	return dao.findAll();
	}
	

}

package com.example.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Student;

@Repository
public class StudentDaoImpl implements IStudentDao  {
	
	private final SessionFactory sessionFactory;

	public StudentDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void saveStudent(Student student)
	{
		
		sessionFactory.getCurrentSession().persist(student);
	}


	@Transactional
	public Student getStudent(Long id) {
		return sessionFactory.getCurrentSession().get(Student.class, id);
		
	}
	
	
	

}

package com.example.Springmanytomany.dao;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Springmanytomany.entity.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
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
		
		// by default @ManyToMany or @OneToMany associations , collections are Lazy so manually initialize it in the active session itself
		Student s = sessionFactory.getCurrentSession().get(Student.class, id);
		Hibernate.initialize(s.getClass());
		return s ;
		
	}
	
	
	

}
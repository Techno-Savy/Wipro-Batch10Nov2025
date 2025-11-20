package com.example.springhiborm.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springhiborm.entity.Student;

//@controller  --> @Service ---- > @Repository(create a methods for crud operations) ----> Hibernate(ORM framework ) ---> database 


@Repository
public class StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void save(Student s)
	{
		sessionFactory.getCurrentSession().persist(s); // transient to persistent
	}
	
	public Student findById(Long id)
	{
		
		return sessionFactory.getCurrentSession().get(Student.class, id);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Student> findAll()
	{
		return (List<Student>) sessionFactory.getCurrentSession()
				.createQuery("from Student")
		        .list();
		
	}

}

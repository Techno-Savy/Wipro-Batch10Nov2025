package com.wipro.onetomany.dao;

import com.wipro.onetomany.entity.Student;

public interface IStudentDao
{
	public void saveStudent(Student student);
	public Student getStudent(Long id) ;
}

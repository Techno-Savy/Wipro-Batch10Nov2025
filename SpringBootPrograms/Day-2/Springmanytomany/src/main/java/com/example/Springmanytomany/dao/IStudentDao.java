package com.example.Springmanytomany.dao;

import com.example.Springmanytomany.entity.Student;

public interface IStudentDao
{
	public void saveStudent(Student student);
	public Student getStudent(Long id) ;
}
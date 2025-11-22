package com.example.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	/* If it is bidirectional
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
    */

	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Student> students = new ArrayList();
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Course(String title) {
		super();
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public List<Student> getStudents() {
		return students;
	}



	public void setStudents(List<Student> students) {
		this.students = students;
	}





	




/* If it is bidirectional
	public void setStudent(Student student) {
		this.student = student;
	}
	
	*/
	

}

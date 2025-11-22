package com.wipro.onetomany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reportcard")
public class ReportCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double marks;
	
	/* uncomment if you want to make it as bidirectional 
	@OneToOne(mappedBy="reportcard")
	private Student student;
    
	*/
	public ReportCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReportCard(double marks) {
		super();
		this.marks = marks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	
	/* uncomment if you have made it as bidirectional 
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

*/
	@Override
	public String toString() {
		return "ReportCard [id=" + id + ", marks=" + marks + "]";
	}
	
	

}


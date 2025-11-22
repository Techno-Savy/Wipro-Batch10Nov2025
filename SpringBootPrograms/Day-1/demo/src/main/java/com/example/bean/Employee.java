package com.example.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Now after adding JPA dependency the entity class is mapped to the Employee table in MySql using
//below annotations @Entity, @Id and @GeneratedValue
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	
	@Id
	int id;
	String name;
	
	
}

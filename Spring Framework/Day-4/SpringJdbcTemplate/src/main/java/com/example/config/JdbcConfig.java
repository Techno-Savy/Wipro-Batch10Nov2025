package com.example.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;




//Spring Configuration class that sets up the 'DataSource' and the 'JdbcTemplate' bean
@Configuration	
@ComponentScan("com.example.dao")
public class JdbcConfig 
{
	//Database Connectivity
	@Bean("dataSource")
	public DataSource getDataSource()
	{
		//Create and configure a 'DriverManagerDataSource' with the database connection details given below
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springJdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	
	//Database operations
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() 
	{   
		//Create a 'JdbcTemplate' bean and sets the datasource in it using setter based dependency Injection
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());//setter based di
		
	   return jdbcTemplate;
	}
	
	

}

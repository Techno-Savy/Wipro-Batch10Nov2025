package com.example.Springmanytomany.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.Springmanytomany.entity.Courses;
import com.example.Springmanytomany.entity.Student;




//configure Hibernate 6 with Spring:
@Configuration
@EnableTransactionManagement
@ComponentScan("com.example.Springmanytomany")
public class AppConfig {
	
	//Database Connectivity
			@Bean
			public DataSource DataSource()
			{
				//Create and configure a 'DriverManagerDataSource' with the database connection details given below
				DriverManagerDataSource dataSource= new DriverManagerDataSource();
				dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
				dataSource.setUrl("jdbc:mysql://localhost:3306/wiprotraining");
				dataSource.setUsername("root");
				dataSource.setPassword("root");
				return dataSource;
			}
			

			
			  @Bean
			    public LocalSessionFactoryBean sessionFactory() {
			        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			        sessionFactory.setDataSource(DataSource());
			        sessionFactory.setAnnotatedClasses(Student.class,Courses.class);
			        sessionFactory.setHibernateProperties(hibernateProperties());

			        return sessionFactory;
			    }


			  private final Properties hibernateProperties() {
			        Properties hibernateProperties = new Properties();
			        hibernateProperties.setProperty(
			          "hibernate.hbm2ddl.auto", "update");
			        hibernateProperties.setProperty(
			          "hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");

			        return hibernateProperties;
			    }
			


			  @Bean
			    public HibernateTransactionManager hibernateTransactionManager() {
				  HibernateTransactionManager transactionManager
			          = new HibernateTransactionManager();
			        transactionManager.setSessionFactory(sessionFactory().getObject());
			        return transactionManager;
			    

		
		}
			  }
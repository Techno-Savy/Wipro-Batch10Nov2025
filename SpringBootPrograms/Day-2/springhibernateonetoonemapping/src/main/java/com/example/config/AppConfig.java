package com.example.config;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.h2.tools.Server;
//import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.entity.ReportCard;
import com.example.entity.Student;

//configure Hibernate 6 with Spring:
@Configuration
@EnableTransactionManagement
@ComponentScan("com.example")
public class AppConfig {
	
	
		//Database Connectivity
		@Bean
		public DataSource DataSource()
		{
			//Create and configure a 'DriverManagerDataSource' with the database connection details given below
			DriverManagerDataSource dataSource= new DriverManagerDataSource();
			dataSource.setDriverClassName("org.h2.Driver");
			//dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
			//dataSource.setUrl("jdbc:mysql://localhost:3306/wiprotraining");
			dataSource.setUsername("root");
			dataSource.setPassword("root");
			return dataSource;
		}
		
		
		  @Bean
		    public LocalSessionFactoryBean sessionFactory() {
		        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		        sessionFactory.setDataSource(DataSource());
		        sessionFactory.setAnnotatedClasses(Student.class, ReportCard.class);
		        sessionFactory.setHibernateProperties(hibernateProperties());

		        return sessionFactory;
		    }


		  private final Properties hibernateProperties() {
		        Properties hibernateProperties = new Properties();
		        hibernateProperties.setProperty(
		          "hibernate.hbm2ddl.auto", "update");
		      //  hibernateProperties.setProperty(
		       //   "hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		        hibernateProperties.setProperty(
				         "hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		        return hibernateProperties;
		    }
		


		  @Bean
		    public HibernateTransactionManager hibernateTransactionManager() {
			  HibernateTransactionManager transactionManager
		          = new HibernateTransactionManager();
		        transactionManager.setSessionFactory(sessionFactory().getObject());
		        return transactionManager;
		    }

//		  @Bean(initMethod = "start", destroyMethod = "stop")
//		    public Server h2WebConsole() throws SQLException {
//		        System.out.println("H2 web console started at http://localhost:8082/");
//		        return Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082");
//		    }

}

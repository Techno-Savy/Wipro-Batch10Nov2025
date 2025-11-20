package com.example.config;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.beans.Todo;




//we are implementing RowMapper to map rows of a ResultSet to ToDo class objects
public class RowMapperImpl implements RowMapper<Todo> {
  // It converts database query results into TodoObjects and mapRow method will extract data from the resultset and create a todo object
	@Override
	public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Todo todo = new Todo();
		todo.setId(rs.getInt(1));
		todo.setTitle(rs.getString(2));
		todo.setDescription(rs.getString(3));
		return todo;
	}

}
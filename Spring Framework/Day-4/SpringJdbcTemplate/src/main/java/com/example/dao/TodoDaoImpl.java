package com.example.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.beans.Todo;
import com.example.config.RowMapperImpl;





@Repository
public class TodoDaoImpl implements TodoDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int saveTodo(Todo todo) {
	String insertQuery= "insert into Todo (id,title,description) values(?,?,?)";//prepared statemnts
	int updatedRows=jdbcTemplate.update(insertQuery,todo.getId(),todo.getTitle(),todo.getDescription());
		return updatedRows;
	}

	@Override
	public int updateTodo(Todo todo) {
		String updateQuery= "update Todo set title=? , description=? where id=?";
		int updatedRows=jdbcTemplate.update(updateQuery,todo.getTitle(),todo.getDescription(),todo.getId());
			return updatedRows;
	}

	@Override
	public int deleteTodo(int id) {
		String deleteQuery= "delete from Todo where id=?";
		int updatedRows=jdbcTemplate.update(deleteQuery,id);
		return updatedRows;
	}

	@Override
	public Todo getTodo(int id) {
		String selectQuery="select * from Todo where id=?";
		Todo todo=jdbcTemplate.queryForObject(selectQuery,new RowMapperImpl(),id);
		return todo;
	}

	@Override
	public List<Todo> getAllTodos() {
		String selectQuery="select * from Todo";
		List<Todo> todos=jdbcTemplate.query(selectQuery,new BeanPropertyRowMapper<>(Todo.class));
		return todos;
	}
	
	
	
	

}
package com.example.service;

import com.example.entity.Task;
import java.util.List;
import java.util.Optional;

public interface TaskService {
	
	//for all those functionalities to implement we have created methods for that
    Task createTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Integer id);
    List<Task> getAllTasks();
    Optional<Task> getTaskById(Integer id);
    List<Task> getTasksByStatus(String status);
    List<Task> getTasksByPriority(String priority);
    List<Task> getOverdueTasks();
}
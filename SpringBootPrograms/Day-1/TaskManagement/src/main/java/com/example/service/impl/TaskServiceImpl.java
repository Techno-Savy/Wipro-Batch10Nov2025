package com.example.service.impl;

import com.example.entity.Task;
import com.example.repository.TaskRepository;
import com.example.service.TaskService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    private static final Set<String> ALLOWED_PRIORITY = Set.of("low", "medium", "high");
    private static final Set<String> ALLOWED_STATUS = Set.of("pending", "in-progress", "completed");

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    private void validateTask(Task task) {
        if (!ALLOWED_PRIORITY.contains(task.getPriority().toLowerCase())) 
            throw new IllegalArgumentException("Invalid priority");

        if (!ALLOWED_STATUS.contains(task.getStatus().toLowerCase())) 
            throw new IllegalArgumentException("Invalid status");
    }

    @Override
    public Task createTask(Task task) {
        validateTask(task);
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        validateTask(task);
        return taskRepository.existsById(task.getId()) ? taskRepository.save(task) : null;
    }

    @Override
    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> getTaskById(Integer id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> getTasksByStatus(String status) {
        return taskRepository.findByStatusIgnoreCase(status);
    }

    @Override
    public List<Task> getTasksByPriority(String priority) {
        return taskRepository.findByPriorityIgnoreCase(priority);
    }

    @Override
    public List<Task> getOverdueTasks() {
        return taskRepository.findByDueDateBefore(LocalDate.now());
    }
}
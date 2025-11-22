package com.example.repository;

import com.example.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByStatusIgnoreCase(String status);
    List<Task> findByPriorityIgnoreCase(String priority);
    List<Task> findByDueDateBefore(LocalDate date);
}
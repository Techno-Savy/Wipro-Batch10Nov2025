package com.example.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Task;
import com.example.service.TaskService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<?> createTask(@RequestBody Task task) {
        if(task.getId() != null && taskService.getTaskById(task.getId()).isPresent())
            return ResponseEntity.status(409).body("Task already exists");

        try {
            return ResponseEntity.status(201).body(taskService.createTask(task));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> updateTask(@RequestBody Task task) {
        if(task.getId() == null)
            return ResponseEntity.badRequest().body("Task ID required");

        Task updated = taskService.updateTask(task);
        return updated == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Integer id) {
        Optional<Task> task = taskService.getTaskById(id);
        return task.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok("Deleted");
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @GetMapping("/search")
    public ResponseEntity<?> getByStatus(@RequestParam String status) {
        return ResponseEntity.ok(taskService.getTasksByStatus(status));
    }

    @GetMapping("/priority/{priority}")
    public ResponseEntity<List<Task>> getByPriority(@PathVariable String priority) {
        return ResponseEntity.ok(taskService.getTasksByPriority(priority));
    }

    @GetMapping("/overdue")
    public ResponseEntity<?> getOverdueTasks() {
        return ResponseEntity.ok(taskService.getOverdueTasks());
    }
}
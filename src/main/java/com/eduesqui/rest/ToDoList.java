package com.eduesqui.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduesqui.model.entitys.Task;
import com.eduesqui.model.service.ITaskService;

@RestController
@RequestMapping (value="todolist")
public class ToDoList {
	
	@Autowired
	private ITaskService taskService;

	@GetMapping(value="tasks")
	public List<Task> getTasks() {
		return taskService.getTask();
	}
	
	@PostMapping(value="tasks")
	public Task addTask(@RequestBody Task task)  {
		return taskService.addTask(task);
	}
	
	@PutMapping(value="tasks")
	public Task updateTask(@RequestBody Task task)  {
		return taskService.addTask(task);
	}
	
	@DeleteMapping(value="tasks/{id}" )
	public boolean deleteTask(@PathVariable(value="id") Long id) {
		taskService.removeTask(id);
		return true;
	}
	
	
	
	
	
}

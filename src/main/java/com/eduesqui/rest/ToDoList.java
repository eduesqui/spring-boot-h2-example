package com.eduesqui.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduesqui.rest.model.entitys.Task;
import com.eduesqui.rest.model.service.ITaskService;

@RestController
@RequestMapping (value="todolist")
public class ToDoList {
	
	@Autowired
	private ITaskService taskService;

	@GetMapping(value="tasks")
	public List<Task> getTasks() {
		return taskService.getTask();
	}
	
	
	
}

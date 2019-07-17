package com.eduesqui.model.service;

import java.util.List;

import com.eduesqui.model.entitys.Task;

public interface ITaskService {

	
	public List<Task> getTask();
	public Task addTask(Task task);
	public void removeTask(Long id);
	public void updateTask();
	
	
}
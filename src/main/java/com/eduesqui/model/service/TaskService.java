package com.eduesqui.model.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduesqui.model.dao.ITaskDao;
import com.eduesqui.model.entitys.Task;

@Service
public class TaskService implements ITaskService {
	
	 @Autowired
	private ITaskDao taskDao;
	
	/**
	 * Method to get all the task
	 * @return
	 */
	public List<Task> getTask() {
		return (List<Task>) taskDao.findAll();
	}

	@Override
	public Task addTask(Task task) {
		task.setCreationDate(new Date());
		task.setStatus(0);	
		return taskDao.save(task);
	}

	@Override
	public void removeTask(Long id) {
		taskDao.deleteById(id);
	}

	@Override
	public Task updateTask(Task task) {	
		return taskDao.save(task);
	}
}

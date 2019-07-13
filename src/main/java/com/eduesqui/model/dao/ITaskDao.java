package com.eduesqui.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.eduesqui.model.entitys.Task;

public interface ITaskDao extends CrudRepository<Task, Long> {

}

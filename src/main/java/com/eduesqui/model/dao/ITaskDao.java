package com.eduesqui.rest.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.eduesqui.rest.model.entitys.Task;

public interface ITaskDao extends CrudRepository<Task, Long> {

}

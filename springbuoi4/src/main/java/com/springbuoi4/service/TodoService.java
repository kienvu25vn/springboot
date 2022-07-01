package com.springbuoi4.service;

import com.springbuoi4.entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService{
    List<Todo> findAll();

    Todo findById(Long id);

    Todo save(Todo todo);

    void delete(Long id);

    List<Todo> findAllTodoContainTitle(String title);
}

package com.springbuoi4.controller;


import com.springbuoi4.entity.Todo;
import com.springbuoi4.repository.TodoRepository;
import com.springbuoi4.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> getTodosContainTitle(@RequestParam(value = "title" , required = false) String title){
        if(title != null) {
            return todoService.findAllTodoContainTitle(title);
        }
        else {
            return todoService.findAll();
        }
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable(value = "id") Long id){
        return todoService.findById(id);
    }

    @PostMapping("/todos")
    public ResponseEntity addTodo(@RequestBody Todo todo){
        todoService.save(todo);
        return ResponseEntity.ok().body(todo);
    }

    @PutMapping("/todos/{id}")
    public Todo editTodo(@PathVariable Long id , @RequestBody Todo todo){
        Todo currentTodo = todoService.findById(id);
        currentTodo.setTitle(todo.getTitle());
        todoService.save(currentTodo);
        return currentTodo;
    }

    @DeleteMapping("/todos/{id}")
    public ResponseEntity deleteTodo(@PathVariable Long id){
        todoService.delete(id);
        return ResponseEntity.ok().build();
    }
}

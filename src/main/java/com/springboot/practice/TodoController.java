package com.springboot.practice;

import com.springboot.practice.models.Todo;
import jdk.javadoc.doclet.Reporter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
//@Slf4j
public class TodoController {

    @Autowired
    private TodoService todoService; // It is a dependency.

    @PostMapping("/create")
    public ResponseEntity<Todo> createUser(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.createTodo(todo), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable long id) {
        try {
            Todo createdTodo = todoService.getTodoById(id);
            return new ResponseEntity<>(createdTodo, HttpStatus.OK);
        } catch (RuntimeException exception) {
            return new ResponseEntity<>((Todo) null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Todo>> getTodos() {
        return new ResponseEntity<>(todoService.getAllTodos(), HttpStatus.OK);
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Todo>> getAllTodosPageByPage(@RequestParam int page, @RequestParam int size) {
        return new ResponseEntity<>(todoService.getAllTodosPageByPage(page, size), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodoById(@RequestBody long id, @RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.updateTodo(todo), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Todo> updateTodoById(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.updateTodo(todo), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable long id) {
        todoService.deleteTodoById(id);
    }

    @DeleteMapping
    public void deleteTodo() {
        todoService.deleteTodo();
    }

}
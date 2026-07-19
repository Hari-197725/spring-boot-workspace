package com.springboot.practice;

import com.springboot.practice.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // This is also a @Bean data type  but in common service classes use this @Service instead of @Bean
public class TodoService {

    @Autowired // @Autowired control all instance kind of thing which you commanded below.
    private TodoRepository todoRepository;

//    When you remove this constructor you got Null Pointer Exception. Here you use Auto wire-ing which is you won't do things
//    by your own spring do that for you. But before doing auto wire-ing current class should be @Bean, it means object in java
//    which is managed by spring itself

//    public TodoService() {
//        todoRepository = new TodoRepository();
//    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

//    public Todo getTodoById(Long id) {
//        return todoRepository.getReferenceById(id);
//    }


    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        todoRepository.delete(getTodoById(id));
    }

    public void deleteTodo(){
        todoRepository.deleteAll();
    }

//    public void deleteTodo(Todo todo) {
//        todoRepository.delete(todo);
//    }

}
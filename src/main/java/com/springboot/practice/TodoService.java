package com.springboot.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void printTodos() {
        System.out.println(todoRepository.getAllTodos());
    }
}

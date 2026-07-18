package com.springboot.practice;

import org.springframework.stereotype.Component;

@Component  // This is also same as service class's @Bean concept.
public class TodoRepository {

    public String getAllTodos() {
        return "Todos";
    }

}
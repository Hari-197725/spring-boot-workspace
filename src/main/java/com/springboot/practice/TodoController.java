package com.springboot.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    private TodoService todoService; // It is a dependency.

    @GetMapping("/get")
    public String getTodo() {
//     TodoService todoService = new TodoService(); You can't create instance like this. So you want to create a dependency.
//     you can see dependency for this above and that is @Autowired. See below how to use that instance.
        todoService.printTodos();
        return "Todos";
    }
}

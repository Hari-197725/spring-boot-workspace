package com.springboot.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/tododemo")
public class TodoControllerDemo {

    @GetMapping("/get")
    public String getTodo() {
        return "New_Todo";
    }

    @GetMapping("/name")
    public String getTodoName() {
        return "Tony" + " " + "Steve";
    }

    //    Path Variable
    @GetMapping("/{id}") // It is a variable.
    public String getTodoBuyId(@PathVariable long id) { // get mapping's id is this id which is in parameter. Using @ to map it both.
        return "Todo with id: " + id;
    }


    //    Request Param
    @GetMapping("") // It is a empty get mapping so you can do like this @GetMapping.
    public String getTodoIdParam(@RequestParam("todoId") long id) {
        return "Todo with id: " + id;
    }

    //    In this every one can see the password openly so its not a correct way to do.
    @GetMapping("/create")
    public String createUserWrongVersion(@RequestParam String userId, @RequestParam String password) {
        return "Todo with Username: " + userId + " " + "password: " + password;
    }

    //    In this correct version you can see @RequestBody instead of @RequestParam. You can't test this in a browser use postman.
//    This is also have @PostMapping not working on @GetMapping
    @PostMapping("/create")
    public String createUser(@RequestBody String body) {
        return body;
    }


    //   You can simply give id as a variable don't need to give path as you see below method, and also @PutMapping can
//    separate it is @PutMapping or #GetMapping's request and use the correct one.
    @PutMapping("/{id}")
    public String updateTodoByIdSimple(@PathVariable long id) {
        return "Put Todo with Id: " + id;
    }

    @PutMapping("/update/{id}")
    public String updateTodoById(@PathVariable long id) {
        return "Put Todo with Id: " + id;
    }

    //   Why here are two same methods check above, about this.
    @DeleteMapping("/{id}")
    public String deleteTodoByIdSimple(@PathVariable long id) {
        return "Delete Todo with Id: " + id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTodoById(@PathVariable long id) {
        return "Delete Todo with Id: " + id;
    }


}
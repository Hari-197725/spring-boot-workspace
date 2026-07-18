
package com.springboot.demo;

//    To using this current class you want other classes it is called "dependency". In this case your TodoService class needs
//    TodoRepository class.
public class TodoServiceDemo {
    private TodoRepositoryDemo todoRepositoryDemo;

    //    Creating object for TodoRepository and works like this is when done by java, spring boot or some other tools instead of your
//        own doing it is called "inversion of control".
    public TodoServiceDemo() {
        todoRepositoryDemo = new TodoRepositoryDemo();
    }

    public void printTodos() {
        System.out.println(todoRepositoryDemo.getAllTodos());
    }


}

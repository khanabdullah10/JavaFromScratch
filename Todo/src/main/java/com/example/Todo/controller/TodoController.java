package com.example.Todo.controller;

import com.example.Todo.entity.Todo;
import com.example.Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {

    @Autowired
    private  final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @PostMapping("/add")
    public Todo add(@RequestBody Todo todo){
        return  todoService.addTodo(todo);
    }

    @GetMapping("/getAll")
    public List<Todo> getAll(){
       return todoService.getAllTodo();
    }

    @GetMapping("/getById/{id}")
    public Todo getByid(@PathVariable Long id){

        return todoService.getTodoById(id).get();
    }

    @PutMapping("/update/{id}")
    public Todo update( @PathVariable Long id ,@RequestBody Todo todo ){
     return    todoService.updateTodo(id,todo);
    }

    @PutMapping("/completed/{id}")
    public Todo completed(@PathVariable Long id ){
        return    todoService.completed(id);
    }

    @DeleteMapping("/delete/{id}")
    public  String delete( Long id){
        return todoService.deleteTodo(id);
    }



}

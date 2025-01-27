package com.example.Todo.service;

import com.example.Todo.entity.Todo;
import com.example.Todo.repo.TodoRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class TodoService {

    private final TodoRepo todoRepo;




    public  TodoService(TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }

    public Todo addTodo(Todo todo){
        todo.setCreateAt(LocalDateTime.now());
       return   todoRepo.save(todo);
    }



    public List<Todo> getAllTodo(){
        return todoRepo.findAll();
    }

    public Optional<Todo> getTodoById(Long id){
     return  todoRepo.findById(id);
    }

    public String deleteTodo(Long id){
        if (todoRepo.existsById(id)) {

            todoRepo.deleteById(id);
            return "deleted";
        }
        else {
            return "not exist";
        }

    }

    public Todo updateTodo(Long id,Todo updateTodo){
        Optional<Todo> existingTodoOpt = todoRepo.findById(id);
        if (existingTodoOpt.isPresent()){
            Todo existingTodo = existingTodoOpt.get();
            existingTodo.setTask(updateTodo.getTask());
            existingTodo.setCompleted(updateTodo.isCompleted());
            if (updateTodo.isCompleted()){
                existingTodo.setCompletedAt(LocalDateTime.now());
            }
          return todoRepo.save(existingTodo);


        }
       return  null;
    }

    public Todo completed(Long id ){
        Optional<Todo> existingTodoOpt = todoRepo.findById(id);

        if(existingTodoOpt.isPresent()){
            Todo todo = existingTodoOpt.get();
            todo.setCompletedAt(LocalDateTime.now());
            todo.setCompleted(true);
            return  todoRepo.save(todo);
        }
        return null;
    }




}

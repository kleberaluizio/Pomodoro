package com.kleberaluizio.pomodoro.controller;

import com.kleberaluizio.pomodoro.model.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tasks")

public class TaskController {
    @Autowired
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model){
        model.addAttribute("tasks",taskService.getAllTasks());
        return "task/list-of-tasks";
    }

    @GetMapping("/registration")
    public String taskRegistration( ){

        return "task/task-registration";
    }

//    @PostMapping
//    public String registerNewTask(TaskRegistrationRequest data){
//        var task = new Task(data);
//
//        //add to db
//
//        return "redirect:/filmes"; // redireciona para um requisicao para a URL /filmes
//    }
}

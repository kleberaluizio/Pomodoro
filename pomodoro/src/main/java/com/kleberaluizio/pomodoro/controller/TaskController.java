package com.kleberaluizio.pomodoro.controller;

import com.kleberaluizio.pomodoro.model.task.Task;
import com.kleberaluizio.pomodoro.model.task.TaskRegistrationRequest;
import com.kleberaluizio.pomodoro.model.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String loadTaskRegistration( ){
        return "task/task-registration";
    }

    @PostMapping("/registration")
    @Transactional
    public String registerTask(TaskRegistrationRequest taskRegistrationData){
        var task = new Task(taskRegistrationData);

        taskService.addTask(task);
        return "redirect:/tasks";
    }

}

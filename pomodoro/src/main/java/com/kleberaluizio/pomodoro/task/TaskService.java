package com.kleberaluizio.pomodoro.task;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskDao taskDao;

    public TaskService(TaskDao taskDao) {
        this.taskDao = taskDao;
    }
}

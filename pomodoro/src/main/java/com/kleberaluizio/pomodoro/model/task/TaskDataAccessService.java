package com.kleberaluizio.pomodoro.model.task;

import org.springframework.stereotype.Repository;

@Repository("jpa")

public class TaskDataAccessService implements TaskDao{

    private final TaskRepository taskRepository;

    public TaskDataAccessService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}

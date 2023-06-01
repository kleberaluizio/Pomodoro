package com.kleberaluizio.pomodoro.task;

public class TaskDataAccessService implements TaskDao{

    private final TaskRepository taskRepository;

    public TaskDataAccessService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}

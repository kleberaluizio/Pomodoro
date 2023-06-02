package com.kleberaluizio.pomodoro.model.task;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskDao taskDao;

    public TaskService(@Qualifier("jpa") TaskDao taskDao) {
        this.taskDao = taskDao;
    }
}

package com.kleberaluizio.pomodoro.model.task;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskDao taskDao;

    public TaskService(@Qualifier("jpa") TaskDao taskDao) {
        this.taskDao = taskDao;
    }


    public List<Task> getAllTasks() {
        return taskDao.selectAllTasks();
    }

    public void addTask(Task task) {
        taskDao.insertTask(task);
    }
}

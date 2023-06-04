package com.kleberaluizio.pomodoro.model.task;

import java.util.List;


public interface TaskDao {
    List<Task> selectAllTasks();

    void insertTask(Task task);
}

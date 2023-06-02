package com.kleberaluizio.pomodoro.model.task;

import org.springframework.stereotype.Service;

import java.util.List;


public interface TaskDao {
    List<Task> selectAllTasks();
}

package com.kleberaluizio.pomodoro.model.task;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("jpa")

public class TaskDataAccessService implements TaskDao{

    private final TaskRepository taskRepository;

    public TaskDataAccessService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> selectAllTasks() {
        return taskRepository.findAll();
    }
}

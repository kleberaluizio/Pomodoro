package com.kleberaluizio.pomodoro.model.task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("taskJpa")
public class TaskDataAccessService implements TaskDao{
    @Autowired
    private final TaskRepository taskRepository;

    public TaskDataAccessService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> selectAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void insertTask(Task task) {
        taskRepository.save(task);
    }
}

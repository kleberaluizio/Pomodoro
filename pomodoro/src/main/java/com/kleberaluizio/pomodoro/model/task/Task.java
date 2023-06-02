package com.kleberaluizio.pomodoro.model.task;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer sprintsGoal;
    private Integer sprintsDone;

    public Task(){}

    public Task (TaskRegistrationRequest taskRegistration){
        this.name = taskRegistration.name();
        this.sprintsGoal = taskRegistration.sprintsGoal();
        this.sprintsDone = 0;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSprintsGoal() {
        return sprintsGoal;
    }

    public Integer getSprintsDone() {
        return sprintsDone;
    }
}

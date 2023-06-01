package com.kleberaluizio.pomodoro.task;

public class Task {
    private String name;
    private Integer sprintsGoal;

    private Integer sprintsDone;


    public Task (TaskRegistrationRequest taskRegistration){
        this.name = taskRegistration.name();
        this.sprintsGoal = taskRegistration.sprintsGoal();
        this.sprintsDone = 0;
    }
}

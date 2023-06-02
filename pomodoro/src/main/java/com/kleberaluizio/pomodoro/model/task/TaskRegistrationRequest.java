package com.kleberaluizio.pomodoro.model.task;

public record TaskRegistrationRequest(
        String name,
        Integer sprintsGoal
) {

}


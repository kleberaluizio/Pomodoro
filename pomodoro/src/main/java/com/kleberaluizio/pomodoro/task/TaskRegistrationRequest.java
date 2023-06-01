package com.kleberaluizio.pomodoro.task;

public record TaskRegistrationRequest(
        String name,
        Integer sprintsGoal
) {

}


package com.kleberaluizio.pomodoro.model.user;

import com.kleberaluizio.pomodoro.model.task.Task;

import java.util.List;

public interface UserDao {
    List<User> selectAllUsers();
    void registerUser(User user);
}

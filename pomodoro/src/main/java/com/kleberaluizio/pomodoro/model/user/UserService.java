package com.kleberaluizio.pomodoro.model.user;

import com.kleberaluizio.pomodoro.model.task.Task;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;

    public UserService(@Qualifier("userJpa") UserDao userDao){
        this.userDao = userDao;
    }

    public void addUser(User user){
        userDao.registerUser(user);
    }

    public List<User> getAllTasks() {
        return userDao.selectAllUsers();
    }
}

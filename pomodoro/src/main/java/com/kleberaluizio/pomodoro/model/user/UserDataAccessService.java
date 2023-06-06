package com.kleberaluizio.pomodoro.model.user;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userJpa")
public class UserDataAccessService implements UserDao{

    private final UserRepository userRepository;

    public UserDataAccessService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }
}

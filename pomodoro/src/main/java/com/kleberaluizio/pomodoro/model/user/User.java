package com.kleberaluizio.pomodoro.model.user;
import com.kleberaluizio.pomodoro.model.task.Task;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "users")
public class User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private List<Task> userTasks;

    public User(){}

    public User(UserRegistrationRequest userRegistrationRequest){
        this.firstName = userRegistrationRequest.firstName();
        this.lastName = userRegistrationRequest.lastName();
        this.userTasks = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Task> getUserTasks() {
        return userTasks;
    }
}

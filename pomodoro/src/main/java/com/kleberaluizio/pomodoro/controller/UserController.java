package com.kleberaluizio.pomodoro.controller;

import com.kleberaluizio.pomodoro.model.user.UserRegistrationRequest;
import com.kleberaluizio.pomodoro.model.user.UserService;
import com.kleberaluizio.pomodoro.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getUsers(Model model){
        model.addAttribute("users",userService.getAllTasks());
        return "user/list-of-users";
    }

    @GetMapping("/registration")
    public String loadUserRegistration(){
        return "user/user-registration";
    }

    @PostMapping("/registration")
    @Transactional
    public String registerUser(UserRegistrationRequest userRegistrationRequest){
        var user = new User(userRegistrationRequest);

        userService.addUser(user);
        return "redirect:/user/registration";
    }
}
